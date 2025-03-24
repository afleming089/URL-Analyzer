function Dashboard() {
  return (
    <>
      <div>
        <form>
          <label for="url-search">Url Search</label>
          <input id="url-search" placeholder="commercebank.com"></input>
          <button onClick={fetchData()}>Submit</button>
        </form>
      </div>
    </>
  );
}

export default Dashboard;
