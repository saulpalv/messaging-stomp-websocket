import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import StompJS5 from './StompJS5';
import * as serviceWorker from './serviceWorker';

ReactDOM.render(
  <React.StrictMode>
    <StompJS5 />
    <label>Open Console to see message io</label>
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
