import { useState } from "react";

function App() {
    const [url, setUrl] = useState("");
    const [result, setResult] = useState("");

    const handleSubmit = async () => {
        try {
            const response = await fetch("http://localhost:8080/api/generate", {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify({ url })
            });

            const data = await response.json();
            setResult(`${data.message} / ${data.url}`);
        } catch (error) {
            setResult("에러 발생");
        }
    };

    return (
        <div style={{ padding: "40px" }}>
            <h1>URL 입력 테스트</h1>

            <input
                type="text"
                value={url}
                onChange={(e) => setUrl(e.target.value)}
                placeholder="상품 URL 입력"
                style={{ width: "400px", padding: "10px" }}
            />

            <button onClick={handleSubmit} style={{ marginLeft: "10px", padding: "10px 16px" }}>
                전송
            </button>

            <p style={{ marginTop: "20px" }}>결과: {result}</p>
        </div>
    );
}

export default App;