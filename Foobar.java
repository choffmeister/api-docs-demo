/**
 * @api {get} /shops/:shopId/products
 * @apiName GetProducts
 * @apiGroup Products
 *
 * @apiParam {string} shopId The current shop.
 * @apiParam {string} categoryId Filter products by categoryId.
 * @apiParam {string="EUR","USD","GBP"} currency The ISO 4217 currency code.
 * @apiParam {string} locale Locale to use (e.g. en_US, ISO 639-1 for language code and ISO 3166-1 for country code).
 */
