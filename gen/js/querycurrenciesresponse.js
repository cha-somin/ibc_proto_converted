// source: rizon/treasury/query.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {missingRequire} reports error on implicit type usages.
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!
/* eslint-disable */
// @ts-nocheck

goog.provide('proto.rizonworld.rizon.treasury.QueryCurrenciesResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.query.v1beta1.PageResponse');
goog.require('proto.rizonworld.rizon.treasury.Currencies');

/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.rizonworld.rizon.treasury.QueryCurrenciesResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.rizonworld.rizon.treasury.QueryCurrenciesResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.rizonworld.rizon.treasury.QueryCurrenciesResponse.displayName = 'proto.rizonworld.rizon.treasury.QueryCurrenciesResponse';
}



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.rizonworld.rizon.treasury.QueryCurrenciesResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.rizonworld.rizon.treasury.QueryCurrenciesResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.rizonworld.rizon.treasury.QueryCurrenciesResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.rizonworld.rizon.treasury.QueryCurrenciesResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    currencies: (f = msg.getCurrencies()) && proto.rizonworld.rizon.treasury.Currencies.toObject(includeInstance, f),
    pagination: (f = msg.getPagination()) && proto.cosmos.base.query.v1beta1.PageResponse.toObject(includeInstance, f)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.rizonworld.rizon.treasury.QueryCurrenciesResponse}
 */
proto.rizonworld.rizon.treasury.QueryCurrenciesResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.rizonworld.rizon.treasury.QueryCurrenciesResponse;
  return proto.rizonworld.rizon.treasury.QueryCurrenciesResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.rizonworld.rizon.treasury.QueryCurrenciesResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.rizonworld.rizon.treasury.QueryCurrenciesResponse}
 */
proto.rizonworld.rizon.treasury.QueryCurrenciesResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.rizonworld.rizon.treasury.Currencies;
      reader.readMessage(value,proto.rizonworld.rizon.treasury.Currencies.deserializeBinaryFromReader);
      msg.setCurrencies(value);
      break;
    case 2:
      var value = new proto.cosmos.base.query.v1beta1.PageResponse;
      reader.readMessage(value,proto.cosmos.base.query.v1beta1.PageResponse.deserializeBinaryFromReader);
      msg.setPagination(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.rizonworld.rizon.treasury.QueryCurrenciesResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.rizonworld.rizon.treasury.QueryCurrenciesResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.rizonworld.rizon.treasury.QueryCurrenciesResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.rizonworld.rizon.treasury.QueryCurrenciesResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCurrencies();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.rizonworld.rizon.treasury.Currencies.serializeBinaryToWriter
    );
  }
  f = message.getPagination();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.base.query.v1beta1.PageResponse.serializeBinaryToWriter
    );
  }
};


/**
 * optional Currencies currencies = 1;
 * @return {?proto.rizonworld.rizon.treasury.Currencies}
 */
proto.rizonworld.rizon.treasury.QueryCurrenciesResponse.prototype.getCurrencies = function() {
  return /** @type{?proto.rizonworld.rizon.treasury.Currencies} */ (
    jspb.Message.getWrapperField(this, proto.rizonworld.rizon.treasury.Currencies, 1));
};


/**
 * @param {?proto.rizonworld.rizon.treasury.Currencies|undefined} value
 * @return {!proto.rizonworld.rizon.treasury.QueryCurrenciesResponse} returns this
*/
proto.rizonworld.rizon.treasury.QueryCurrenciesResponse.prototype.setCurrencies = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.rizonworld.rizon.treasury.QueryCurrenciesResponse} returns this
 */
proto.rizonworld.rizon.treasury.QueryCurrenciesResponse.prototype.clearCurrencies = function() {
  return this.setCurrencies(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.rizonworld.rizon.treasury.QueryCurrenciesResponse.prototype.hasCurrencies = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional cosmos.base.query.v1beta1.PageResponse pagination = 2;
 * @return {?proto.cosmos.base.query.v1beta1.PageResponse}
 */
proto.rizonworld.rizon.treasury.QueryCurrenciesResponse.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageResponse} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageResponse, 2));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageResponse|undefined} value
 * @return {!proto.rizonworld.rizon.treasury.QueryCurrenciesResponse} returns this
*/
proto.rizonworld.rizon.treasury.QueryCurrenciesResponse.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.rizonworld.rizon.treasury.QueryCurrenciesResponse} returns this
 */
proto.rizonworld.rizon.treasury.QueryCurrenciesResponse.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.rizonworld.rizon.treasury.QueryCurrenciesResponse.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 2) != null;
};


