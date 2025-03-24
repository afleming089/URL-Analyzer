import { useState } from "react";
import { useEffect } from "react";

function Dashboard() {
  function useFetch(event) {
    event.preventDefault();

    // TO DO gets url but returns the HTML file
    fetch(URL, {
      method: "GET",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(),
    })
      .then((response) => {
        response.json();
      })
      .then((data) => console.log(data))
      .catch((error) => console.error("Error: ", error));
  }

  const [url, setUrl] = useState("");

  return (
    <>
      <div>
        <form onSubmit={useFetch}>
          <label htmlFor="url-search">Url Search</label>
          <input
            id="url-search"
            placeholder="commercebank.com"
            onChange={(e) => setUrl(e.target.value)}></input>
          <button type="submit">Fetch</button>
        </form>
      </div>
    </>
  );
}

export default Dashboard;
