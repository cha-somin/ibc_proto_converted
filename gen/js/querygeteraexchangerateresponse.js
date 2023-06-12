// source: stafihub/ledger/query.proto
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

goog.provide('proto.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.stafihub.stafihub.ledger.EraExchangeRate');

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
proto.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse.displayName = 'proto.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse';
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
proto.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    eraexchangerate: (f = msg.getEraexchangerate()) && proto.stafihub.stafihub.ledger.EraExchangeRate.toObject(includeInstance, f)
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
 * @return {!proto.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse}
 */
proto.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse;
  return proto.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse}
 */
proto.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.stafihub.stafihub.ledger.EraExchangeRate;
      reader.readMessage(value,proto.stafihub.stafihub.ledger.EraExchangeRate.deserializeBinaryFromReader);
      msg.setEraexchangerate(value);
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
proto.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getEraexchangerate();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.stafihub.stafihub.ledger.EraExchangeRate.serializeBinaryToWriter
    );
  }
};


/**
 * optional EraExchangeRate eraExchangeRate = 1;
 * @return {?proto.stafihub.stafihub.ledger.EraExchangeRate}
 */
proto.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse.prototype.getEraexchangerate = function() {
  return /** @type{?proto.stafihub.stafihub.ledger.EraExchangeRate} */ (
    jspb.Message.getWrapperField(this, proto.stafihub.stafihub.ledger.EraExchangeRate, 1));
};


/**
 * @param {?proto.stafihub.stafihub.ledger.EraExchangeRate|undefined} value
 * @return {!proto.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse} returns this
*/
proto.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse.prototype.setEraexchangerate = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse} returns this
 */
proto.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse.prototype.clearEraexchangerate = function() {
  return this.setEraexchangerate(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.stafihub.stafihub.ledger.QueryGetEraExchangeRateResponse.prototype.hasEraexchangerate = function() {
  return jspb.Message.getField(this, 1) != null;
};


