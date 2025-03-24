import { useEffect } from "react";

function fetchData() {
  useEffect(() => {
    fetch(URL, { method: "GET" })
      .then((response) => response.json())
      .then((data) =>
        console.log(data).catch((error) => console.error("Error: ", error))
      );
  });
}
