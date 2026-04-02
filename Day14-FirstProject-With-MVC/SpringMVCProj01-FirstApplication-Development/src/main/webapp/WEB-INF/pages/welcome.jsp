<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Welcome to first SpringMVC Project</title>
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link href="https://fonts.googleapis.com/css2?family=DM+Serif+Display:ital@0;1&family=DM+Mono:wght@300;400&display=swap" rel="stylesheet" />

    <style>
        *, *::before, *::after {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        :root {
            --bg:        #0d0d0d;
            --surface:   #141414;
            --border:    #222;
            --accent:    #c8f060;
            --text:      #e8e8e0;
            --muted:     #555;
            --mono:      'DM Mono', monospace;
            --serif:     'DM Serif Display', serif;
        }

        html, body {
            height: 100%;
            background: var(--bg);
            color: var(--text);
            font-family: var(--mono);
        }

        /* ── Noise overlay ── */
        body::before {
            content: '';
            position: fixed;
            inset: 0;
            background-image: url("data:image/svg+xml,%3Csvg viewBox='0 0 200 200' xmlns='http://www.w3.org/2000/svg'%3E%3Cfilter id='n'%3E%3CfeTurbulence type='fractalNoise' baseFrequency='0.75' numOctaves='4' stitchTiles='stitch'/%3E%3C/filter%3E%3Crect width='100%25' height='100%25' filter='url(%23n)' opacity='0.04'/%3E%3C/svg%3E");
            background-size: 200px 200px;
            pointer-events: none;
            z-index: 0;
        }

        /* ── Layout ── */
        .wrapper {
            position: relative;
            z-index: 1;
            min-height: 100vh;
            display: grid;
            grid-template-rows: auto 1fr auto;
        }

        /* ── Nav ── */
        nav {
            display: flex;
            align-items: center;
            justify-content: space-between;
            padding: 1.4rem 2.5rem;
            border-bottom: 1px solid var(--border);
        }

        .nav-logo {
            font-family: var(--mono);
            font-size: 0.72rem;
            letter-spacing: 0.18em;
            text-transform: uppercase;
            color: var(--accent);
        }

        .nav-links {
            display: flex;
            gap: 2rem;
            list-style: none;
        }

        .nav-links a {
            font-size: 0.72rem;
            letter-spacing: 0.12em;
            text-transform: uppercase;
            color: var(--muted);
            text-decoration: none;
            transition: color 0.2s;
        }

        .nav-links a:hover { color: var(--text); }

        /* ── Hero ── */
        .hero {
            display: flex;
            flex-direction: column;
            align-items: flex-start;
            justify-content: center;
            padding: 6rem 2.5rem;
            max-width: 900px;
        }

        .tag {
            display: inline-flex;
            align-items: center;
            gap: 0.5rem;
            font-size: 0.68rem;
            letter-spacing: 0.16em;
            text-transform: uppercase;
            color: var(--accent);
            border: 1px solid color-mix(in srgb, var(--accent) 30%, transparent);
            padding: 0.3rem 0.75rem;
            margin-bottom: 2rem;
            animation: fadeUp 0.6s ease both;
        }

        .tag::before {
            content: '';
            width: 6px;
            height: 6px;
            border-radius: 50%;
            background: var(--accent);
            animation: pulse 2s ease infinite;
        }

        @keyframes pulse {
            0%, 100% { opacity: 1; }
            50%       { opacity: 0.3; }
        }

        h1 {
            font-family: var(--serif);
            font-size: clamp(2.8rem, 7vw, 5.5rem);
            line-height: 1.05;
            letter-spacing: -0.02em;
            color: var(--text);
            animation: fadeUp 0.6s 0.1s ease both;
        }

        h1 em {
            font-style: italic;
            color: var(--accent);
        }

        .subtitle {
            margin-top: 1.6rem;
            font-size: 0.82rem;
            line-height: 1.9;
            color: var(--muted);
            max-width: 480px;
            animation: fadeUp 0.6s 0.2s ease both;
        }

        .actions {
            display: flex;
            gap: 1rem;
            margin-top: 2.8rem;
            animation: fadeUp 0.6s 0.3s ease both;
        }

        .btn {
            display: inline-flex;
            align-items: center;
            gap: 0.5rem;
            font-family: var(--mono);
            font-size: 0.72rem;
            letter-spacing: 0.1em;
            text-transform: uppercase;
            padding: 0.75rem 1.5rem;
            text-decoration: none;
            cursor: pointer;
            border: none;
            transition: transform 0.15s, background 0.2s;
        }

        .btn:active { transform: scale(0.97); }

        .btn-primary {
            background: var(--accent);
            color: #0d0d0d;
        }

        .btn-primary:hover { background: #d6ff6e; }

        .btn-outline {
            background: transparent;
            color: var(--muted);
            border: 1px solid var(--border);
        }

        .btn-outline:hover {
            border-color: var(--text);
            color: var(--text);
        }

        /* ── Cards ── */
        .cards-section {
            border-top: 1px solid var(--border);
            padding: 3.5rem 2.5rem;
            animation: fadeUp 0.6s 0.4s ease both;
        }

        .cards-label {
            font-size: 0.65rem;
            letter-spacing: 0.2em;
            text-transform: uppercase;
            color: var(--muted);
            margin-bottom: 1.5rem;
        }

        .cards {
            display: grid;
            grid-template-columns: repeat(auto-fit, minmax(200px, 1fr));
            gap: 1px;
            background: var(--border);
            border: 1px solid var(--border);
        }

        .card {
            background: var(--surface);
            padding: 1.6rem;
            transition: background 0.2s;
        }

        .card:hover { background: #1a1a1a; }

        .card-icon {
            font-size: 1.1rem;
            margin-bottom: 0.9rem;
        }

        .card h3 {
            font-family: var(--mono);
            font-size: 0.78rem;
            font-weight: 400;
            letter-spacing: 0.06em;
            color: var(--text);
            margin-bottom: 0.5rem;
        }

        .card p {
            font-size: 0.7rem;
            line-height: 1.7;
            color: var(--muted);
        }

        /* ── Footer ── */
        footer {
            border-top: 1px solid var(--border);
            padding: 1.2rem 2.5rem;
            display: flex;
            align-items: center;
            justify-content: space-between;
        }

        footer span {
            font-size: 0.65rem;
            letter-spacing: 0.1em;
            color: var(--muted);
        }

        .status {
            display: flex;
            align-items: center;
            gap: 0.4rem;
            font-size: 0.65rem;
            letter-spacing: 0.1em;
            color: var(--accent);
        }

        .status::before {
            content: '';
            width: 5px;
            height: 5px;
            border-radius: 50%;
            background: var(--accent);
        }

        /* ── Animation ── */
        @keyframes fadeUp {
            from { opacity: 0; transform: translateY(16px); }
            to   { opacity: 1; transform: translateY(0); }
        }
    </style>
</head>
<body>
<div class="wrapper">

    <!-- Nav -->
    <nav>
        <span class="nav-logo">Spring&nbsp;MVC</span>
        <ul class="nav-links">
            <li><a href="#">Home</a></li>
            <li><a href="#">Docs</a></li>
            <li><a href="#">API</a></li>
        </ul>
    </nav>

    <!-- Hero -->
    <main>
        <section class="hero">
            <span class="tag">Spring MVC · v1.0.0</span>

            <h1>Welcome to your<br /><em>first</em> SpringMVC<br />Project</h1>

            <p class="subtitle">
                A clean, structured foundation built on the
                DispatcherServlet pattern — ready for controllers,
                views, and everything in between.
            </p>

            <div class="actions">
                <a href="#" class="btn btn-primary">Get Started →</a>
                <a href="#" class="btn btn-outline">View Docs</a>
            </div>
        </section>

        <!-- Info cards -->
        <section class="cards-section">
            <p class="cards-label">What's included</p>
            <div class="cards">
                <div class="card">
                    <div class="card-icon">⚙️</div>
                    <h3>DispatcherServlet</h3>
                    <p>Central front-controller routing all incoming HTTP requests to the right handler.</p>
                </div>
                <div class="card">
                    <div class="card-icon">🗂️</div>
                    <h3>View Resolver</h3>
                    <p>Resolves logical view names returned by controllers to physical JSP templates.</p>
                </div>
                <div class="card">
                    <div class="card-icon">🔗</div>
                    <h3>Model & Controller</h3>
                    <p>Clean separation between business logic and presentation via @Controller beans.</p>
                </div>
                <div class="card">
                    <div class="card-icon">📦</div>
                    <h3>Dependency Injection</h3>
                    <p>Spring IoC container manages your beans and wires dependencies automatically.</p>
                </div>
            </div>
        </section>
    </main>

    <!-- Footer -->
    <footer>
        <span>© <%= new java.util.Date().getYear() + 1900 %> SpringMVC Project</span>
        <span class="status">Server running</span>
    </footer>

</div>
</body>
</html>
