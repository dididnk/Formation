import logo from './logo.svg';
import LogoRed from './logo-red.svg';
import './App.css';

const AppLink = () =>{
  const learnReactText = "Learn React";
  return <a
      className="App-link"
      href="https://reactjs.org"
      target="_blank"
      rel="noopener noreferrer"
    >
      {learnReactText}
    </a>
}

const Logo = ({ svg }) => <img id="logo" src={logo} className="App-logo" alt="logo" />

function App() {
  const handleOnClick = (svg) =>{
    const logo = document.getElementById("logo")
    logo.src = svg;
  }
  return (
    <div className="App">
      <header className="App-header">
        <Logo />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <AppLink/>
        <button onClick={() => handleOnClick(logo)}>Blue</button>
        <button onClick={() => handleOnClick(LogoRed)}>Red</button>
      </header>
    </div>
  );
}

export default App;
