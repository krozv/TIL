import globals from "globals";
import tseslint from "typescript-eslint";
import pluginReact from "eslint-plugin-react";


export default [
  {files: ["**/*.{js,mjs,cjs,ts,jsx,tsx}"]},
  {languageOptions: { globals: {...globals.browser, ...globals.node} }},
  ...tseslint.configs.recommended,
  pluginReact.configs.flat.recommended,
  {
    "rules": {
      "@typescript-eslint/no-unused-vars": "off",
      "prefer-const": "off"
    }
  }
];