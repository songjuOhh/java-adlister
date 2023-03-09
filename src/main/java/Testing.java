import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/test") // If you are using this path, you have to do this:
public class Testing extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.getWriter().println("<html>\n" +
                "<head>\n" +
                "  <meta charset=\"utf-8\">\n" +
                "  <title>Add a geocoder</title>\n" +
                "  <meta charset=\"UTF-8\">\n" +
                "  <title>First Mapbox Map</title>\n" +
                "  <!-- Mapbox CSS -->\n" +
                "  <link href='https://api.mapbox.com/mapbox-gl-js/v2.9.1/mapbox-gl.css' rel='stylesheet' />\n" +
                "  <link rel='stylesheet' href='https://api.mapbox.com/mapbox-gl-js/plugins/mapbox-gl-geocoder/v4.7.0/mapbox-gl-geocoder.css' type='text/css' />\n" +
                "  <script src=\"https://api.mapbox.com/mapbox-gl-js/v2.12.0/mapbox-gl.js\"></script>\n" +
                "  <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n" +
                "  <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.3/font/bootstrap-icons.css\">\n" +
                "  <link href=\"css/weather_map.css\" rel=\"stylesheet\">\n" +

                "<style>body {\n" +
                "    margin: 0;\n" +
                "    padding: 0;\n" +
                "    color: white;\n" +
                "    background: url(/images/night2.jpg) no-repeat center center fixed;\n" +
                "    -webkit-background-size: cover;\n" +
                "    -moz-background-size: cover;\n" +
                "    -o-background-size: cover;\n" +
                "    background-size: cover;\n" +
                "}\n" +
                "\n" +
                ".city{\n" +
                "    font-size: 16px;\n" +
                "    color: yellow;\n" +
                "}\n" +
                ".location{\n" +
                "    font-size: 20px;\n" +
                "    color: yellow;\n" +
                "}\n" +
                "\n" +
                ".page-wrapper{\n" +
                "    background: rgba(3, 3, 17,.7);\n" +
                "}\n" +
                "\n" +
                "header{\n" +
                "    padding: .5em;\n" +
                "}\n" +
                "\n" +
                ".top-bar{\n" +
                "    background: rgba(3, 3, 17,1);\n" +
                "}\n" +
                "\n" +
                "#map {\n" +
                "    /* the width and height may be set to any size */\n" +
                "    width: 100%;\n" +
                "    height: 310px;\n" +
                "    margin-top: 2em;\n" +
                "}\n" +
                "\n" +
                ".page-wrapper{\n" +
                "    padding: 0;\n" +
                "    margin: 0;\n" +
                "}\n" +
                "\n" +
                "\n" +
                ".hide {\n" +
                "    display: none;\n" +
                "}\n" +
                "\n" +
                ".input-group{\n" +
                "    display: block;\n" +
                "    margin-left: auto;\n" +
                "    margin-right: auto;\n" +
                "\n" +
                "    width: 500px;\n" +
                "    margin-top: 2em;\n" +
                "}\n" +
                "\n" +
                ".mainScreen{\n" +
                "    display: flex;\n" +
                "    flex-direction: column;\n" +
                "    justify-content: center;\n" +
                "    align-items: center;\n" +
                "\n" +
                "    background: rgba(3, 3, 17,.3);\n" +
                "    height: 400px;\n" +
                "    margin-bottom: 1em;\n" +
                "\n" +
                "}\n" +
                "\n" +
                "#cards{\n" +
                "    width: 100%;\n" +
                "    display: flex;\n" +
                "    flex-direction: row;\n" +
                "    justify-content: space-evenly;\n" +
                "    /*background: rgba(9, 9, 52, 1);*/\n" +
                "}\n" +
                ".card{\n" +
                "    width: 250px;\n" +
                "    background: rgba(3, 3, 17,.3);\n" +
                "    /*border:rgba(255, 255, 255, 0.2) solid 2px;*/\n" +
                "}\n" +
                "\n" +
                ".card-header{\n" +
                "    font-size: 12px;\n" +
                "    background: rgba(255, 255, 255, 0.1);\n" +
                "}\n" +
                "\n" +
                ".temp{\n" +
                "    padding: 10px 10px 0 10px;\n" +
                "    font-size: 14px;\n" +
                "}\n" +
                "\n" +
                "h6{\n" +
                "    font-size: 12px;\n" +
                "}\n" +
                "\n" +
                ".logo:hover{\n" +
                "    color:yellow;\n" +
                "}\n" +
                "\n" +
                ".mainScreen{\n" +
                "}\n" +
                "\n" +
                ".main-card{\n" +
                "    border: rgba(255, 255, 255, 0.2) solid 1px;\n" +
                "    padding: 3em 5em 3em 5em;\n" +
                "    margin: 2em;\n" +
                "    display: flex;\n" +
                "    flex-direction: column;\n" +
                "    justify-content: center;\n" +
                "    align-items: center;\n" +
                "}\n" +
                "\n" +
                ".temp-main {\n" +
                "    font-size: 110px;\n" +
                "    margin: 20px;\n" +
                "}\n" +
                ".temp-main span{\n" +
                "    font-size: 50px;\n" +
                "}\n" +
                "\n" +
                ".details{\n" +
                "    display: flex;\n" +
                "    flex-direction: row;\n" +
                "}\n" +
                ".details h6{\n" +
                "    margin: 1em;\n" +
                "    font-size: 14px;\n" +
                "    font-style: normal;\n" +
                "}\n" +
                "\n" +
                "\n" +
                ".border {\n" +
                "    position: absolute;\n" +
                "    display: block;\n" +
                "    top: -50%;\n" +
                "    left: -50%;\n" +
                "    z-index: -9;\n" +
                "    display: block;\n" +
                "    height: 200%;\n" +
                "    width: 200%;\n" +
                "    transform: rotate(-45deg);\n" +
                "    overflow: hidden;\n" +
                "    background: linear-gradient(to right, #fff 20%, #fff 40%, #ECD08C 50%, #ECD08C 55%, #fff 70%, #fff 100%);\n" +
                "    background-size: 200% auto;\n" +
                "\n" +
                "    animation: shine 3s linear infinite;\n" +
                "}\n" +
                "\n" +
                "/*Begin shimmer code*/\n" +
                "\n" +
                "@keyframes shine {\n" +
                "    to {\n" +
                "        background-position: 200% center;\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "/*CSS component for animated icons*/\n" +
                "\n" +
                ".stage {\n" +
                "    position: absolute;\n" +
                "    top: 50%;\n" +
                "    left: 50%;\n" +
                "    width: 600px;\n" +
                "    height: 96px;\n" +
                "    margin-left: -300px;\n" +
                "    margin-top: -30px;\n" +
                "}\n" +
                "\n" +
                "svg {\n" +
                "    width: 48px;\n" +
                "    height: 48px;\n" +
                "    margin: 24px 0 10px 0;\n" +
                "    fill: yellow;\n" +
                "}\n" +
                "\n" +
                "/* Thunder Bolt Animation */\n" +
                ".thunder-cloud .bolt {\n" +
                "    animation: flash 2s infinite;\n" +
                "}\n" +
                "\n" +
                "@keyframes flash {\n" +
                "    0% {\n" +
                "        transform: translateY(-25px) translateX(25px) scaleY(0.95);\n" +
                "        opacity: 0;\n" +
                "    }\n" +
                "    5%, 25% {\n" +
                "        opacity: 1;\n" +
                "    }\n" +
                "    15%, 20% {\n" +
                "        opacity: 0;\n" +
                "    }\n" +
                "    50% {\n" +
                "        transform: translateY(8px) translateX(-10px);\n" +
                "        opacity: 1;\n" +
                "    }\n" +
                "    80% {\n" +
                "        transform: translateY(8px) translateX(-10px);\n" +
                "        opacity: 0;\n" +
                "    }\n" +
                "    100% {\n" +
                "        transform: translateY(-25px) translateX(25px) scaleY(0.95);\n" +
                "        opacity: 0;\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "/* Raindrops Animation */\n" +
                ".rain-cloud .raindrop-one,\n" +
                ".rain-cloud .raindrop-two,\n" +
                ".rain-cloud .raindrop-three {\n" +
                "    opacity: 0;\n" +
                "    animation-timing-function: cubic-bezier(1, 0, 1, 1);\n" +
                "}\n" +
                "\n" +
                ".rain-cloud .raindrop-one {\n" +
                "    animation: falling-drop-one 2s infinite;\n" +
                "}\n" +
                "\n" +
                ".rain-cloud .raindrop-two {\n" +
                "    animation: falling-drop-two 1.90s infinite;\n" +
                "    animation-delay: 0.8s;\n" +
                "}\n" +
                "\n" +
                ".rain-cloud .raindrop-three {\n" +
                "    animation: falling-drop-three 1.80s infinite;\n" +
                "    animation-delay: 0.5s;\n" +
                "}\n" +
                "\n" +
                "@keyframes falling-drop-one {\n" +
                "    0% {\n" +
                "        transform: translateY(-35px);\n" +
                "        opacity: 0;\n" +
                "    }\n" +
                "    10% {\n" +
                "        transform: translateY(-15px);\n" +
                "        opacity: 1;\n" +
                "    }\n" +
                "    30% {\n" +
                "        opacity: 1;\n" +
                "    }\n" +
                "    60% {\n" +
                "        transform: translateY(100px);\n" +
                "        opacity: 0;\n" +
                "    }\n" +
                "    100% {\n" +
                "        transform: translateY(-35px);\n" +
                "        opacity: 0;\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "@keyframes falling-drop-two {\n" +
                "    0% {\n" +
                "        transform: translateY(-105px);\n" +
                "        opacity: 0;\n" +
                "    }\n" +
                "    10% {\n" +
                "        transform: translateY(-85px);\n" +
                "        opacity: 1;\n" +
                "    }\n" +
                "    30% {\n" +
                "        opacity: 1;\n" +
                "    }\n" +
                "    60% {\n" +
                "        transform: translateY(5px);\n" +
                "        opacity: 0;\n" +
                "    }\n" +
                "    100% {\n" +
                "        transform: translateY(-105px);\n" +
                "        opacity: 0;\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "@keyframes falling-drop-three {\n" +
                "    0% {\n" +
                "        transform: translateY(-105px);\n" +
                "        opacity: 0;\n" +
                "    }\n" +
                "    10% {\n" +
                "        transform: translateY(-85px);\n" +
                "        opacity: 1;\n" +
                "    }\n" +
                "    30% {\n" +
                "        opacity: 1;\n" +
                "    }\n" +
                "    60% {\n" +
                "        transform: translateY(35px);\n" +
                "        opacity: 0;\n" +
                "    }\n" +
                "    100% {\n" +
                "        transform: translateY(-105px);\n" +
                "        opacity: 0;\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "/* Snowflake Animations */\n" +
                ".snow-cloud .snowflake-one,\n" +
                ".snow-cloud .snowflake-two,\n" +
                ".snow-cloud .snowflake-three {\n" +
                "    opacity: 0;\n" +
                "    transform-origin: center center;\n" +
                "    animation-timing-function: ease-in;\n" +
                "}\n" +
                "\n" +
                ".snow-cloud .snowflake-one {\n" +
                "    animation: falling-snow-one 4s infinite;\n" +
                "}\n" +
                "\n" +
                ".snow-cloud .snowflake-two {\n" +
                "    animation: falling-snow-two 3.8s infinite;\n" +
                "    animation-delay: 2.5s;\n" +
                "}\n" +
                "\n" +
                ".snow-cloud .snowflake-three {\n" +
                "    animation: falling-snow-three 3.9s infinite;\n" +
                "    animation-delay: 1.5s;\n" +
                "}\n" +
                "\n" +
                "@keyframes falling-snow-one {\n" +
                "    0% {\n" +
                "        transform: translateY(-65px) rotate(0);\n" +
                "        opacity: 0;\n" +
                "    }\n" +
                "    20% {\n" +
                "        transform: translateY(-10px) translateX(30px) rotate(-30deg);\n" +
                "        opacity: 1;\n" +
                "    }\n" +
                "    40% {\n" +
                "        transform: translateY(45px) translateX(-30px) rotate(30deg);\n" +
                "    }\n" +
                "    50% {\n" +
                "        opacity: 1;\n" +
                "    }\n" +
                "    60% {\n" +
                "        transform: translateY(100px) translateX(30px) rotate(-30deg);\n" +
                "        opacity: 0;\n" +
                "    }\n" +
                "    100% {\n" +
                "        transform: translateY(-65px);\n" +
                "        opacity: 0;\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "@keyframes falling-snow-two {\n" +
                "    0% {\n" +
                "        transform: translateY(-75px) rotate(0);\n" +
                "        opacity: 0;\n" +
                "    }\n" +
                "    20% {\n" +
                "        transform: translateY(-45px) translateX(40px) rotate(-30deg);\n" +
                "        opacity: 1;\n" +
                "    }\n" +
                "    40% {\n" +
                "        transform: translateY(5px) translateX(-40px) rotate(30deg);\n" +
                "    }\n" +
                "    50% {\n" +
                "        opacity: 1;\n" +
                "    }\n" +
                "    60% {\n" +
                "        transform: translateY(30px) translateX(20px) rotate(-30deg);\n" +
                "        opacity: 0;\n" +
                "    }\n" +
                "    100% {\n" +
                "        transform: translateY(-75px);\n" +
                "        opacity: 0;\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "@keyframes falling-snow-three {\n" +
                "    0% {\n" +
                "        transform: translateY(-85px) rotate(0);\n" +
                "        opacity: 0;\n" +
                "    }\n" +
                "    20% {\n" +
                "        transform: translateY(-10px) translateX(-30px) rotate(30deg);\n" +
                "        opacity: 1;\n" +
                "    }\n" +
                "    40% {\n" +
                "        transform: translateY(25px) translateX(30px) rotate(-30deg);\n" +
                "    }\n" +
                "    50% {\n" +
                "        opacity: 1;\n" +
                "    }\n" +
                "    60% {\n" +
                "        transform: translateY(60px) translateX(-30px) rotate(30deg);\n" +
                "        opacity: 0;\n" +
                "    }\n" +
                "    100% {\n" +
                "        transform: translateY(-85px);\n" +
                "        opacity: 0;\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "/* Sunny Cloud Animations */\n" +
                ".sun-cloud .sun-half {\n" +
                "    animation: sun-grow 4s infinite cubic-bezier(0.2, 0.85, 0.4, 1.5);\n" +
                "    transform-origin: bottom center;\n" +
                "}\n" +
                "\n" +
                ".sun-cloud .ray-one {\n" +
                "    animation: ray-show-one 4s infinite linear;\n" +
                "    transform-origin: center right;\n" +
                "}\n" +
                ".sun-cloud .ray-two {\n" +
                "    animation: ray-show-two 4s infinite linear;\n" +
                "    transform-origin: bottom right;\n" +
                "}\n" +
                ".sun-cloud .ray-three {\n" +
                "    animation: ray-show-three 4s infinite linear;\n" +
                "    transform-origin: bottom center;\n" +
                "}\n" +
                ".sun-cloud .ray-four {\n" +
                "    animation: ray-show-four 4s infinite linear;\n" +
                "    transform-origin: bottom left;\n" +
                "}\n" +
                ".sun-cloud .ray-five {\n" +
                "    animation: ray-show-five 4s infinite linear;\n" +
                "    transform-origin: center left;\n" +
                "}\n" +
                "\n" +
                "@keyframes sun-grow {\n" +
                "    0%, 90%, 100% {\n" +
                "        transform: scale(0.5);\n" +
                "        opacity: 0;\n" +
                "    }\n" +
                "    15%, 80% {\n" +
                "        transform: scale(1);\n" +
                "        opacity: 1;\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "@keyframes ray-show-one {\n" +
                "    0%, 15%, 80%, 100% {\n" +
                "        transform: scale(0.5);\n" +
                "        opacity: 0;\n" +
                "    }\n" +
                "    20%, 70% {\n" +
                "        transform: scale(1);\n" +
                "        opacity: 1;\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "@keyframes ray-show-two {\n" +
                "    0%, 20%, 80%, 100% {\n" +
                "        transform: scale(0.5);\n" +
                "        opacity: 0;\n" +
                "    }\n" +
                "    25%, 70% {\n" +
                "        transform: scale(1);\n" +
                "        opacity: 1;\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "@keyframes ray-show-three {\n" +
                "    0%, 25%, 80%, 100% {\n" +
                "        transform: scale(0.5);\n" +
                "        opacity: 0;\n" +
                "    }\n" +
                "    30%, 70% {\n" +
                "        transform: scale(1);\n" +
                "        opacity: 1;\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "@keyframes ray-show-four {\n" +
                "    0%, 30%, 80%, 100% {\n" +
                "        transform: scale(0.5);\n" +
                "        opacity: 0;\n" +
                "    }\n" +
                "    35%, 70% {\n" +
                "        transform: scale(1);\n" +
                "        opacity: 1;\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "@keyframes ray-show-five {\n" +
                "    0%, 35%, 80%, 100% {\n" +
                "        transform: scale(0.5);\n" +
                "        opacity: 0;\n" +
                "    }\n" +
                "    40%, 70% {\n" +
                "        transform: scale(1);\n" +
                "        opacity: 1;\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "@keyframes ray-show-six {\n" +
                "    0%, 40%, 80%, 100% {\n" +
                "        transform: scale(0.5);\n" +
                "        opacity: 0;\n" +
                "    }\n" +
                "    45%, 70% {\n" +
                "        transform: scale(1);\n" +
                "        opacity: 1;\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "@keyframes ray-show-seven {\n" +
                "    0%, 45%, 80%, 100% {\n" +
                "        transform: scale(0.5);\n" +
                "        opacity: 0;\n" +
                "    }\n" +
                "    50%, 70% {\n" +
                "        transform: scale(1);\n" +
                "        opacity: 1;\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "@keyframes ray-show-eight {\n" +
                "    0%, 50%, 80%, 100% {\n" +
                "        transform: scale(0.5);\n" +
                "        opacity: 0;\n" +
                "    }\n" +
                "    55%, 70% {\n" +
                "        transform: scale(1);\n" +
                "        opacity: 1;\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "/* Sunshine Animation */\n" +
                "/* If only using this animation be sure to grab the sun-grow and ray-show-x keyframes set above */\n" +
                ".sunshine .sun-full {\n" +
                "    animation: sun-grow 4s infinite cubic-bezier(0.2, 0.85, 0.4, 1.5);\n" +
                "    transform-origin: center center;\n" +
                "}\n" +
                "\n" +
                ".sunshine .sun-ray-one {\n" +
                "    animation: ray-show-one 4s infinite ease-in;\n" +
                "    transform-origin: center right;\n" +
                "}\n" +
                "\n" +
                ".sunshine .sun-ray-two {\n" +
                "    animation: ray-show-two 4s infinite ease-in;\n" +
                "    transform-origin: bottom right;\n" +
                "}\n" +
                "\n" +
                ".sunshine .sun-ray-three {\n" +
                "    animation: ray-show-three 4s infinite ease-in;\n" +
                "    transform-origin: bottom center;\n" +
                "}\n" +
                "\n" +
                ".sunshine .sun-ray-four {\n" +
                "    animation: ray-show-four 4s infinite ease-in;\n" +
                "    transform-origin: bottom left;\n" +
                "}\n" +
                "\n" +
                ".sunshine .sun-ray-five {\n" +
                "    animation: ray-show-five 4s infinite ease-in;\n" +
                "    transform-origin: center left;\n" +
                "}\n" +
                "\n" +
                ".sunshine .sun-ray-six {\n" +
                "    animation: ray-show-six 4s infinite ease-in;\n" +
                "    transform-origin: top left;\n" +
                "}\n" +
                "\n" +
                ".sunshine .sun-ray-seven {\n" +
                "    animation: ray-show-seven 4s infinite ease-in;\n" +
                "    transform-origin: top center;\n" +
                "}\n" +
                "\n" +
                ".sunshine .sun-ray-eight {\n" +
                "    animation: ray-show-eight 4s infinite ease-in;\n" +
                "    transform-origin: top right;\n" +
                "}\n" +
                "\n" +
                "/* Windy Cloud Animation */\n" +
                ".windy-cloud .cloud-wrap {\n" +
                "    animation: bob 2s infinite cubic-bezier(0,0,.5,1.5);\n" +
                "}\n" +
                ".windy-cloud .cloud {\n" +
                "    animation: cloud-push 4s infinite;\n" +
                "    transform-origin: left center;\n" +
                "}\n" +
                ".windy-cloud .wind-one {\n" +
                "    animation: wind-slide-one 4s infinite;\n" +
                "}\n" +
                ".windy-cloud .wind-two {\n" +
                "    animation: wind-slide-two 4s infinite;\n" +
                "}\n" +
                ".windy-cloud .wind-three {\n" +
                "    animation: wind-slide-three 4s infinite;\n" +
                "}\n" +
                "\n" +
                "@keyframes bob {\n" +
                "    0%, 100% {\n" +
                "        transform: translateY(10px);\n" +
                "    }\n" +
                "    50% {\n" +
                "        transform: translateY(-10px);\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "@keyframes cloud-push {\n" +
                "    0%, 80%, 100% {\n" +
                "        transform: translateX(-120px) scale(1.2);\n" +
                "    }\n" +
                "    10%, 60% {\n" +
                "        transform: translateX(0) scale(1);\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "@keyframes wind-slide-one {\n" +
                "    0%, 70%, 100% {\n" +
                "        transform: scaleX(0);\n" +
                "        opacity: 0;\n" +
                "    }\n" +
                "    10%, 60% {\n" +
                "        transform: scaleX(1);\n" +
                "        opacity: 1;\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "@keyframes wind-slide-two {\n" +
                "    0%, 70%, 100% {\n" +
                "        transform: scaleX(0);\n" +
                "        opacity: 0;\n" +
                "    }\n" +
                "    10%, 60% {\n" +
                "        transform: scaleX(1);\n" +
                "        opacity: 1;\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "@keyframes wind-slide-three {\n" +
                "    0%, 70%, 100% {\n" +
                "        transform: scaleX(0);\n" +
                "        opacity: 0;\n" +
                "    }\n" +
                "    10%, 60% {\n" +
                "        transform: scaleX(1);\n" +
                "        opacity: 1;\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "\n</style>\n" +
                "</head>\n" +
                "\n" +
                "\n" +
                "<body>\n" +
                "\n" +
                "<!-- Load the `mapbox-gl-geocoder` plugin. -->\n" +
                "<script src=\"https://api.mapbox.com/mapbox-gl-js/plugins/mapbox-gl-geocoder/v5.0.0/mapbox-gl-geocoder.min.js\"></script>\n" +
                "<link rel=\"stylesheet\" href=\"https://api.mapbox.com/mapbox-gl-js/plugins/mapbox-gl-geocoder/v5.0.0/mapbox-gl-geocoder.css\" type=\"text/css\">\n" +
                "\n" +
                "<!-- Jquery link -->\n" +
                "<script\n" +
                "        src=\"https://code.jquery.com/jquery-2.2.4.min.js\"\n" +
                "        integrity=\"sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44=\"\n" +
                "        crossorigin=\"anonymous\"\n" +
                "></script>\n" +
                "\n" +
                "\n" +
                "<div class=\"page-wrapper \">\n" +
                "\n" +
                "  <div class=\"row\">\n" +
                "    <header class=\"container-fluid \">\n" +
                "      <div class=\"top-bar text-white g-0 px-2 d-flex flex-row justify-content-between fixed-top\">\n" +
                "        <div class=\"logo column g-0 \">Weather App <i class=\"bi bi-globe-americas\"></i></div>\n" +
                "        <div class=\"d-flex\">\n" +
                "          <div class=\" mx-1 fs-6\"> Current city:</div>\n" +
                "          <div class=\"city fs-6\"> San Antonio</div>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "    </header>\n" +
                "  </div>\n" +
                "\n" +
                "\n" +
                "  <main class=\"container-fluid g-0\">\n" +
                "    <div class=\"row full-width\">\n" +
                "      <div class=\"column position-relative\">\n" +
                "        <div class=\"input-group mb-5 \">\n" +
                "          <div class=\"d-flex\">\n" +
                "          <input id=\"search-input\" type=\"text\" class=\"form-control\" placeholder=\"Place name\" aria-label=\"place name\" aria-describedby=\"button-addon2\">\n" +
                "          <button class=\"btn btn-outline-secondary text-white\" type=\"button\" id=\"button-addon2\">Search</button>\n" +
                "          </div>\n" +
                "        </div>\n" +
                "        <div class=\"mainScreen\">\n" +
                "          <div class=\"main-card\">\n" +
                "            <div class=\"border\"></div>\n" +
                "            <div>Today's weather of</div>\n" +
                "            <div class=\"location\"></div>\n" +
                "            <div class=\"temp-main\"> </div>\n" +
                "            <div class=\"details\">\n" +
                "              <h6 class=\"mx-2\"></h6>\n" +
                "              <h6 class=\"mx-2\"></h6>\n" +
                "              <h6 class=\"mx-2\"></h6>\n" +
                "              <h6 class=\"mx-2\"></h6>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "        </div>\n" +
                "\n" +
                "\n" +
                "        <div class=\"d-flex justify-content-between \" id=\"cards \">\n" +
                "          <div class=\"card\" id=\"cards\">\n" +
                "            <div class=\"card-header\">\n" +
                "              date yyyy-mm-dd\n" +
                "            </div>\n" +
                "            <div class=\"temp\"> temperature 75.43 F</div>\n" +
                "            <hr>\n" +
                "            <div class=\"card-body\">\n" +
                "              <h6>Description</h6>\n" +
                "              <h6>Humidity</h6>\n" +
                "              <h6>Wind</h6>\n" +
                "              <h6>Pressure</h6>\n" +
                "            </div>\n" +
                "          </div>\n" +
                "        </div>\n" +
                "      </div>\n" +
                "    </div>\n" +
                "    <div class=\"row\">\n" +
                "      <div id='map'></div>\n" +
                "    </div>\n" +
                "  </main>\n" +
                "</div>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<!--keys-->\n" +

                "<script src=\"js/keys.js\"></script>\n" +
                "\n" +

                "<script>\n" +
                "\"use strict\";\n" +
                "\n" +
                "//html components for animated icons\n" +
                "const cloudImages = {\n" +
                "    'Rain':  `<svg class=\"rain-cloud\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" viewBox=\"0 0 512 512\">\n" +
                "        <path class=\"raindrop-one\" d=\"M96,384c0,17.7,14.3,32,32,32s32-14.3,32-32s-32-64-32-64S96,366.3,96,384z\" />\n" +
                "        <path class=\"raindrop-two\" d=\"M225,480c0,17.7,14.3,32,32,32s32-14.3,32-32s-32-64-32-64S225,462.3,225,480z\" />\n" +
                "        <path class=\"raindrop-three\" d=\"M352,448c0,17.7,14.3,32,32,32s32-14.3,32-32s-32-64-32-64S352,430.3,352,448z\" />\n" +
                "        <path d=\"M400,64c-5.3,0-10.6,0.4-15.8,1.1C354.3,24.4,307.2,0,256,0s-98.3,24.4-128.2,65.1c-5.2-0.8-10.5-1.1-15.8-1.1\n" +
                "            C50.2,64,0,114.2,0,176s50.2,112,112,112c13.7,0,27.1-2.5,39.7-7.3c29,25.2,65.8,39.3,104.3,39.3c38.5,0,75.3-14.1,104.3-39.3\n" +
                "            c12.6,4.8,26,7.3,39.7,7.3c61.8,0,112-50.2,112-112S461.8,64,400,64z M400,256c-17.1,0-32.9-5.5-45.9-14.7\n" +
                "            C330.6,269.6,295.6,288,256,288c-39.6,0-74.6-18.4-98.1-46.7c-13,9.2-28.8,14.7-45.9,14.7c-44.2,0-80-35.8-80-80s35.8-80,80-80\n" +
                "            c10.8,0,21.1,2.2,30.4,6.1C163.7,60.7,206.3,32,256,32s92.3,28.7,113.5,70.1c9.4-3.9,19.7-6.1,30.5-6.1c44.2,0,80,35.8,80,80\n" +
                "            S444.2,256,400,256z\" />\n" +
                "        </svg>`,\n" +
                "    'Sunny': `<svg class=\"sunshine\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" viewBox=\"0 0 512 512\">\n" +
                "        <path class=\"sun-full\" d=\"M256,144c-61.8,0-112,50.2-112,112s50.2,112,112,112s112-50.2,112-112S317.8,144,256,144z M256,336\n" +
                "            c-44.2,0-80-35.8-80-80s35.8-80,80-80s80,35.8,80,80S300.2,336,256,336z\" />\n" +
                "        <path class=\"sun-ray-eight\" d=\"M131.6,357.8l-22.6,22.6c-6.2,6.2-6.2,16.4,0,22.6s16.4,6.2,22.6,0l22.6-22.6c6.2-6.3,6.2-16.4,0-22.6\n" +
                "            C147.9,351.6,137.8,351.6,131.6,357.8z\" />\n" +
                "        <path class=\"sun-ray-seven\" d=\"M256,400c-8.8,0-16,7.2-16,16v32c0,8.8,7.2,16,16,16s16-7.2,16-16v-32C272,407.2,264.8,400,256,400z\" />\n" +
                "        <path class=\"sun-ray-six\" d=\"M380.5,357.8c-6.3-6.2-16.4-6.2-22.6,0c-6.3,6.2-6.3,16.4,0,22.6l22.6,22.6c6.2,6.2,16.4,6.2,22.6,0\n" +
                "            s6.2-16.4,0-22.6L380.5,357.8z\" />\n" +
                "        <path class=\"sun-ray-five\" d=\"M448,240h-32c-8.8,0-16,7.2-16,16s7.2,16,16,16h32c8.8,0,16-7.2,16-16S456.8,240,448,240z\" />\n" +
                "        <path class=\"sun-ray-four\" d=\"M380.4,154.2l22.6-22.6c6.2-6.2,6.2-16.4,0-22.6s-16.4-6.2-22.6,0l-22.6,22.6c-6.2,6.2-6.2,16.4,0,22.6\n" +
                "            C364.1,160.4,374.2,160.4,380.4,154.2z\" />\n" +
                "        <path class=\"sun-ray-three\" d=\"M256,112c8.8,0,16-7.2,16-16V64c0-8.8-7.2-16-16-16s-16,7.2-16,16v32C240,104.8,247.2,112,256,112z\" />\n" +
                "        <path class=\"sun-ray-two\" d=\"M131.5,154.2c6.3,6.2,16.4,6.2,22.6,0c6.3-6.2,6.3-16.4,0-22.6l-22.6-22.6c-6.2-6.2-16.4-6.2-22.6,0\n" +
                "            c-6.2,6.2-6.2,16.4,0,22.6L131.5,154.2z\" />\n" +
                "        <path class=\"sun-ray-one\" d=\"M112,256c0-8.8-7.2-16-16-16H64c-8.8,0-16,7.2-16,16s7.2,16,16,16h32C104.8,272,112,264.8,112,256z\" />\n" +
                "      </svg> `,\n" +
                "    'Clouds':  `<svg class=\"sun-cloud\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" viewBox=\"0 0 512 512\">\n" +
                "      <path class=\"sun-half\" d=\"M127.8,259.1c3.1-4.3,6.5-8.4,10-12.3c-6-11.2-9.4-24-9.4-37.7c0-44.1,35.7-79.8,79.8-79.8\n" +
                "          c40,0,73.1,29.4,78.9,67.7c11.4,2.3,22.4,5.7,32.9,10.4c-0.4-29.2-12-56.6-32.7-77.3C266.1,109,238,97.4,208.2,97.4\n" +
                "          c-29.9,0-57.9,11.6-79.1,32.8c-21.1,21.1-32.8,49.2-32.8,79.1c0,17.2,3.9,33.9,11.2,48.9c1.5-0.1,3-0.1,4.4-0.1\n" +
                "          C117.3,258,122.6,258.4,127.8,259.1z\" />\n" +
                "      <path class=\"cloud\" d=\"M400,256c-5.3,0-10.6,0.4-15.8,1.1c-16.8-22.8-39-40.5-64.2-51.7c-10.5-4.6-21.5-8.1-32.9-10.4\n" +
                "          c-10.1-2-20.5-3.1-31.1-3.1c-45.8,0-88.4,19.6-118.2,52.9c-3.5,3.9-6.9,8-10,12.3c-5.2-0.8-10.5-1.1-15.8-1.1c-1.5,0-3,0-4.4,0.1\n" +
                "          C47.9,258.4,0,307.7,0,368c0,61.8,50.2,112,112,112c13.7,0,27.1-2.5,39.7-7.3c29,25.2,65.8,39.3,104.3,39.3\n" +
                "          c38.5,0,75.3-14.1,104.3-39.3c12.6,4.8,26,7.3,39.7,7.3c61.8,0,112-50.2,112-112S461.8,256,400,256z M400,448\n" +
                "          c-17.1,0-32.9-5.5-45.9-14.7C330.6,461.6,295.6,480,256,480c-39.6,0-74.6-18.4-98.1-46.7c-13,9.2-28.8,14.7-45.9,14.7\n" +
                "          c-44.2,0-80-35.8-80-80s35.8-80,80-80c7.8,0,15.4,1.2,22.5,3.3c2.7,0.8,5.4,1.7,8,2.8c4.5-8.7,9.9-16.9,16.2-24.4\n" +
                "          C182,241.9,216.8,224,256,224c10.1,0,20,1.2,29.4,3.5c10.6,2.5,20.7,6.4,30.1,11.4c23.2,12.4,42.1,31.8,54.1,55.2\n" +
                "          c9.4-3.9,19.7-6.1,30.5-6.1c44.2,0,80,35.8,80,80S444.2,448,400,448z\" />\n" +
                "      <path class=\"ray ray-one\" d=\"M16,224h32c8.8,0,16-7.2,16-16s-7.2-16-16-16H16c-8.8,0-16,7.2-16,16S7.2,224,16,224z\" />\n" +
                "      <path class=\"ray ray-two\" d=\"M83.5,106.2c6.3,6.2,16.4,6.2,22.6,0c6.3-6.2,6.3-16.4,0-22.6L83.5,60.9c-6.2-6.2-16.4-6.2-22.6,0\n" +
                "          c-6.2,6.2-6.2,16.4,0,22.6L83.5,106.2z\" />\n" +
                "      <path class=\"ray ray-three\" d=\"M208,64c8.8,0,16-7.2,16-16V16c0-8.8-7.2-16-16-16s-16,7.2-16,16v32C192,56.8,199.2,64,208,64z\" />\n" +
                "      <path class=\"ray ray-four\" d=\"M332.4,106.2l22.6-22.6c6.2-6.2,6.2-16.4,0-22.6c-6.2-6.2-16.4-6.2-22.6,0l-22.6,22.6\n" +
                "          c-6.2,6.2-6.2,16.4,0,22.6S326.2,112.4,332.4,106.2z\" />\n" +
                "      <path class=\"ray ray-five\" d=\"M352,208c0,8.8,7.2,16,16,16h32c8.8,0,16-7.2,16-16s-7.2-16-16-16h-32C359.2,192,352,199.2,352,208z\" />\n" +
                "    </svg>`,\n" +
                "    'Clear': `<svg class=\"windy-cloud\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" viewBox=\"0 0 512 512\">\n" +
                "    <g class=\"cloud-wrap\">\n" +
                "    <path class=\"cloud\" d=\"M417,166.1c-24-24.5-57.1-38.8-91.7-38.8c-34.6,0-67.7,14.2-91.7,38.8c-52.8,2.5-95,46.2-95,99.6\n" +
                "    c0,55,44.7,99.7,99.7,99.7c5.8,0,11.6-0.5,17.3-1.5c20.7,13.5,44.9,20.9,69.7,20.9c24.9,0,49.1-7.3,69.8-20.9\n" +
                "    c5.7,1,11.5,1.5,17.3,1.5c54.9,0,99.6-44.7,99.6-99.7C512,212.3,469.8,168.5,417,166.1z M412.4,333.3c-8.3,0-16.4-1.5-24-4.4\n" +
                "    c-17.5,15.2-39.8,23.8-63.1,23.8c-23.2,0-45.5-8.5-63-23.8c-7.6,2.9-15.8,4.4-24,4.4c-37.3,0-67.7-30.4-67.7-67.7\n" +
                "    c0-37.3,30.4-67.7,67.7-67.7c3.2,0,6.4,0.2,9.5,0.7c18.1-24.6,46.5-39.4,77.5-39.4c30.9,0,59.4,14.8,77.5,39.4\n" +
                "    c3.1-0.5,6.3-0.7,9.6-0.7c37.3,0,67.6,30.4,67.6,67.7C480,303,449.7,333.3,412.4,333.3z\" />\n" +
                "    </g>\n" +
                "    <path class=\"wind-three\" d=\"M144,352H16c-8.8,0-16,7.2-16,16s7.2,16,16,16h128c8.8,0,16-7.2,16-16S152.8,352,144,352z\" />\n" +
                "    <path class=\"wind-two\" d=\"M16,320h94c8.8,0,16-7.2,16-16s-7.2-16-16-16H16c-8.8,0-16,7.2-16,16S7.2,320,16,320z\" />\n" +
                "    <path class=\"wind-one\" d=\"M16,256h64c8.8,0,16-7.2,16-16s-7.2-16-16-16H16c-8.8,0-16,7.2-16,16S7.2,256,16,256z\" />\n" +
                "  </svg>`\n" +
                "}\n" +
                "\n" +
                "\n" +
                "mapboxgl.accessToken = keys.mapbox;\n" +
                "\n" +
                "\n" +
                "// Setting default map screen on the screen\n" +
                "const map = new mapboxgl.Map({\n" +
                "    container: 'map',\n" +
                "// Choose from Mapbox's core styles, or make your own style with Mapbox Studio\n" +
                "    style: 'mapbox://styles/songju/cld4tpq6y001f01qxglqv8jsa',\n" +
                "    center: [-98.49, 29.42],\n" +
                "    zoom: 10\n" +
                "});\n" +
                "\n" +
                "\n" +
                "\n" +
                "// Add zoom and rotation controls to the map.\n" +
                "map.addControl(new mapboxgl.NavigationControl());\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "// Create marker\n" +
                "function createMarker(lng, lat){\n" +
                "    const marker = new mapboxgl.Marker({\n" +
                "        draggable:true})\n" +
                "        .setLngLat([lng, lat])\n" +
                "        .addTo(map);\n" +
                "\n" +
                "    $('#button-addon2').on('click', function (e) {\n" +
                "        e.preventDefault();\n" +
                "        marker.remove()\n" +
                "    })\n" +
                "    marker.on('dragend', function() {\n" +
                "        var lngLat = marker.getLngLat();\n" +
                "        console.log(lngLat.lng, lngLat.lat);\n" +
                "        getWeather( lngLat.lng, lngLat.lat)\n" +
                "        map.flyTo({\n" +
                "            zoom:15,\n" +
                "            center: [lngLat.lng, lngLat.lat],\n" +
                "            essential: true // this animation is considered essential with respect to prefers-reduced-motion\n" +
                "        });\n" +
                "    });\n" +
                "    marker.on('clicked', function (){\n" +
                "        marker.remove();\n" +
                "    })\n" +
                "}\n" +
                "createMarker(-98.49, 29.42);\n" +
                "\n" +
                "\n" +
                "// Geocode\n" +
                "function geocode(search, token) {\n" +
                "    var baseUrl = 'https://api.mapbox.com';\n" +
                "    var endPoint = '/geocoding/v5/mapbox.places/';\n" +
                "    return fetch(baseUrl + endPoint + encodeURIComponent(search) + '.json' + \"?\" + 'access_token=' + token)\n" +
                "        .then(function(res) {\n" +
                "            return res.json();\n" +
                "            // to get all the data from the request, comment out the following three lines...\n" +
                "        }).then(function(data) {\n" +
                "            return data.features[0].center;\n" +
                "        });\n" +
                "}\n" +
                "\n" +
                "\n" +
                "\n" +
                "// Reverse-Geocode\n" +
                "function reverseGeocode(coordinates, token) {\n" +
                "    var baseUrl = 'https://api.mapbox.com';\n" +
                "    var endPoint = '/geocoding/v5/mapbox.places/';\n" +
                "    return fetch(baseUrl + endPoint + coordinates.lng + \",\" + coordinates.lat + '.json' + \"?\" + 'access_token=' + token)\n" +
                "        .then(function(res) {\n" +
                "            return res.json();\n" +
                "        })\n" +
                "        // to get all the data from the request, comment out the following three lines...\n" +
                "        .then(function(data) {\n" +
                "            return data.features[0].place_name;\n" +
                "        });\n" +
                "}\n" +
                "\n" +
                "\n" +
                "\n" +
                "// Weather Map Api //\n" +
                "const OPEN_WEATHER_APPID = keys.weatherMap;\n" +
                "\n" +
                "\n" +
                "// get weather on default //\n" +
                "function getWeather(lon, lat) {\n" +
                "        $.get('https://api.openweathermap.org/data/2.5/forecast', {\n" +
                "            lat: lat,\n" +
                "            lon: lon,\n" +
                "            appid: OPEN_WEATHER_APPID,\n" +
                "            units: 'imperial'\n" +
                "        })\n" +
                "\n" +
                "            .done(function (data) {\n" +
                "                // console.log( reverseGeocode(lon, lat))\n" +
                "                console.log(data)\n" +
                "\n" +
                "                // can be used to get forecast conditions at current time in increments of 24 hours\n" +
                "                // weather Forecast loop\n" +
                "                let html = '', main='', location='';\n" +
                "                for (let i = 0; i < data.list.length; i += 8) {\n" +
                "                    html += (`\n" +
                "                            <div class=\"card\">\n" +
                "                                <div class=\"card-header text-center \">\n" +
                "                                  ${data.list[i].dt_txt.slice(0, 10)}\n" +
                "\n" +
                "                                </div>\n" +
                "                                <div class=\"d-flex flex-column justify-content-center align-items-center\">\n" +
                "                                    ${cloudImages[data.list[i].weather[0].main]}\n" +
                "                                    <div class=\"temp\"> ${data.list[i].main.temp_max} °F / ${data.list[i].main.temp_min} °F</div>\n" +
                "                                </div>\n" +
                "                                <hr>\n" +
                "                                <div class=\"card-body\">\n" +
                "                                  <h6><i class=\"bi bi-cloud-sun\"></i> <span>${data.list[i].weather[0].description}</span></h6>\n" +
                "                                  <h6><i class=\"bi bi-droplet\"></i> <span>${data.list[i].main.humidity}</span></h6>\n" +
                "                                  <h6><i class=\"bi bi-wind\"></i> <span> ${data.list[i].wind.speed} / ${data.list[i].wind.deg}°</span></h6>\n" +
                "                                  <h6><i class=\"bi bi-cloud-haze2\"></i> <span>${data.list[i].main.pressure}</span></h6>\n" +
                "                                </div>\n" +
                "                              </div>\n" +
                "                            `)\n" +
                "\n" +
                "                }\n" +
                "                $('.card').html(html);\n" +
                "\n" +
                "                //reverse Geocode for location update\n" +
                "                reverseGeocode({lng: lon, lat: lat}, keys.mapbox).then(function(results) {\n" +
                "                    location += results.split(',').slice(1,2);\n" +
                "                    console.log(location)\n" +
                "                    $('.location').html(location);\n" +
                "                    $('.city').html(location);\n" +
                "                })\n" +
                "\n" +
                "\n" +
                "                // Main page loop\n" +
                "                for (let i = 0; i < 1; i += 1) {\n" +
                "                    main += (`\n" +
                "                    <div class=\"mainScreen\">\n" +
                "                    \n" +
                "                        <div class=\"main-card\">\n" +
                "                          <div>Today's weather of</div>\n" +
                "                          <div class=\"location\"></div>\n" +
                "                          <div class=\"temp-main\"> ${data.list[i].main.temp.toFixed()} <span>°F</span></div>\n" +
                "                          \n" +
                "                          <div class=\"details\">\n" +
                "                            <h6 class=\"mx-2\"><i class=\"bi bi-cloud-sun\"></i> <span class=\"mx-2\">${data.list[i].weather[0].description}</span></h6>\n" +
                "                            <h6 class=\"mx-2\"><i class=\"bi bi-droplet\"></i> <span class=\"mx-2\">${data.list[i].main.humidity}</span></h6>\n" +
                "                            <h6 class=\"mx-2\"><i class=\"bi bi-wind\"></i> <span class=\"mx-2\">${data.list[i].wind.speed} / ${data.list[i].wind.deg}°</span></h6>\n" +
                "                            <h6 class=\"mx-2\"><i class=\"bi bi-cloud-haze2\"></i> <span class=\"mx-2\">${data.list[i].main.pressure}</span></h6>\n" +
                "                          </div>\n" +
                "                        </div>\n" +
                "                    </div>\n" +
                "                           `)\n" +
                "                }\n" +
                "                $('.mainScreen').html(main);\n" +
                "            })\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "// set default weather on the page on first load\n" +
                "getWeather(-98.49,29.42);\n" +
                "\n" +
                "\n" +
                "\n" +
                "// get weather on search //\n" +
                "function getWeatherFromSearch() {\n" +
                "\n" +
                "    let address = $(\"#search-input\").val();\n" +
                "    geocode(address, keys.mapbox).then(function (result) {\n" +
                "        console.log(result)\n" +
                "        map.flyTo({\n" +
                "            center: result,\n" +
                "            essential: true\n" +
                "        })\n" +
                "        getWeather(result[0], result[1]);\n" +
                "        createMarker(result[0], result[1]);\n" +
                "    })\n" +
                "}\n" +
                "\n" +
                "\n" +
                "\n" +
                "// load Weather followed by the search result\n" +
                "// by clicking Button\n" +
                "$('#button-addon2').on('click',function (e){\n" +
                "    e.preventDefault();\n" +
                "    getWeatherFromSearch();\n" +
                "})\n" +
                "\n" +
                "\n" +
                "// by pressing Enter\n" +
                "$('#search-input').on('keypress', function (e){\n" +
                "    if(e.key === \"Enter\"){\n" +
                "        e.preventDefault();\n" +
                "        getWeatherFromSearch();\n" +
                "    }\n" +
                "})\n" +
                "\n" +
                "\n" +
                "//onclick, the page zoom out\n" +
                "map.on('click', function (e){\n" +
                "    e.preventDefault();\n" +
                "    map.flyTo({\n" +
                "        zoom:5,\n" +
                "        essential: true\n" +
                "    });\n" +
                "})\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n</script>\n"+
                "<!-- Mapbox Geocoder Util Methods -->\n" +
                "<script src=\"js/mapbox-geocoder-utils.js\"></script>\n" +
                "\n" +
                "<!-- Mapbox JS -->\n" +
                "<script src='https://api.mapbox.com/mapbox-gl-js/v2.9.1/mapbox-gl.js'></script>\n" +
                "\n" +
                "<script src=\"js/weather_map.js\"> </script>\n" +
                "\n" +
                "</body>\n" +
                "\n" +
                "\n" +
                "\n" +
                "</html>");
    }
}

