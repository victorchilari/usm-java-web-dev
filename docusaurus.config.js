const lightCodeTheme = require('prism-react-renderer/themes/github');
const darkCodeTheme = require('prism-react-renderer/themes/dracula');

// With JSDoc @type annotations, IDEs can provide config autocompletion
/** @type {import('@docusaurus/types').DocusaurusConfig} */
module.exports = {
	title: 'Java - dezvoltare aplicatiilor web',
	tagline:
		'Laboratoarele in cadrul obiectului "Tehnologii Java pentru internet"',
	url: 'https://victorchilari.github.io',
	baseUrl: '/usm-java-web-dev/',
	onBrokenLinks: 'throw',
	onBrokenMarkdownLinks: 'warn',
	favicon: 'img/favicon.ico',
	organizationName: 'victorchilari', // Usually your GitHub org/user name.
	projectName: 'usm-java-web-dev', // Usually your repo name.

	presets: [
		[
			'@docusaurus/preset-classic',
			/** @type {import('@docusaurus/preset-classic').Options} */
			({
				docs: {
					sidebarPath: require.resolve('./sidebars.js'),
					routeBasePath: '/'
				},
				theme: {
					customCss: require.resolve('./src/css/custom.css')
				}
			})
		]
	],

	themeConfig:
		/** @type {import('@docusaurus/preset-classic').ThemeConfig} */
		({
			navbar: {
				title: 'Java, web dev',
				logo: {
					alt: 'Site Logo',
					src: 'img/logo.svg'
				},
				items: [
					{
						type: 'doc',
						docId: 'intro',
						position: 'left',
						label: 'Laboratoare'
					}
				]
			},
			footer: {
				style: 'dark',
				links: [
					{
						title: 'More',
						items: [
							{
								label: 'GitHub',
								href: 'https://github.com/facebook/docusaurus'
							}
						]
					}
				],
				copyright: `Copyright © ${new Date().getFullYear()} Victor Chilari.`
			},
			prism: {
				theme: lightCodeTheme,
				darkTheme: darkCodeTheme
			}
		})
};
