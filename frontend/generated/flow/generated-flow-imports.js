import '@vaadin/polymer-legacy-adapter/style-modules.js';
import '@vaadin/login/theme/lumo/vaadin-login-overlay.js';
import '@vaadin/common-frontend/ConnectionIndicator.js';
import '@vaadin/vaadin-lumo-styles/color-global.js';
import '@vaadin/vaadin-lumo-styles/typography-global.js';
import '@vaadin/vaadin-lumo-styles/sizing.js';
import '@vaadin/vaadin-lumo-styles/spacing.js';
import '@vaadin/vaadin-lumo-styles/style.js';
import '@vaadin/vaadin-lumo-styles/vaadin-iconset.js';

const loadOnDemand = (key) => {
  const pending = [];
  if (key === 'c0b2f77aa248dc747353379dd158de2169bc7728d1e704b0df28c55ee65c06da') {
    pending.push(import('./chunks/chunk-c0b2f77aa248dc747353379dd158de2169bc7728d1e704b0df28c55ee65c06da.js'));
  }
  if (key === 'f10a14bd68fc5f6c4a3ed3ae7e75b74888a58a727f416159cd30aa9074f89415') {
    pending.push(import('./chunks/chunk-f10a14bd68fc5f6c4a3ed3ae7e75b74888a58a727f416159cd30aa9074f89415.js'));
  }
  if (key === '4c446523b774d62d5761e7f06a624576bd882b865dde58ead028c655da12bc30') {
    pending.push(import('./chunks/chunk-4c446523b774d62d5761e7f06a624576bd882b865dde58ead028c655da12bc30.js'));
  }
  return Promise.all(pending);
}

window.Vaadin = window.Vaadin || {};
window.Vaadin.Flow = window.Vaadin.Flow || {};
window.Vaadin.Flow.loadOnDemand = loadOnDemand;