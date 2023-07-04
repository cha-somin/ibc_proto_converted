// source: injective/exchange/v1beta1/exchange.proto
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

goog.provide('proto.injective.exchange.v1beta1.ExpiryFuturesMarketInfo');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

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
proto.injective.exchange.v1beta1.ExpiryFuturesMarketInfo = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.injective.exchange.v1beta1.ExpiryFuturesMarketInfo, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.exchange.v1beta1.ExpiryFuturesMarketInfo.displayName = 'proto.injective.exchange.v1beta1.ExpiryFuturesMarketInfo';
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
proto.injective.exchange.v1beta1.ExpiryFuturesMarketInfo.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.exchange.v1beta1.ExpiryFuturesMarketInfo.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.exchange.v1beta1.ExpiryFuturesMarketInfo} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketInfo.toObject = function(includeInstance, msg) {
  var f, obj = {
    marketId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    expirationTimestamp: jspb.Message.getFieldWithDefault(msg, 2, 0),
    twapStartTimestamp: jspb.Message.getFieldWithDefault(msg, 3, 0),
    expirationTwapStartPriceCumulative: jspb.Message.getFieldWithDefault(msg, 4, ""),
    settlementPrice: jspb.Message.getFieldWithDefault(msg, 5, "")
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
 * @return {!proto.injective.exchange.v1beta1.ExpiryFuturesMarketInfo}
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketInfo.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.exchange.v1beta1.ExpiryFuturesMarketInfo;
  return proto.injective.exchange.v1beta1.ExpiryFuturesMarketInfo.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.exchange.v1beta1.ExpiryFuturesMarketInfo} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.exchange.v1beta1.ExpiryFuturesMarketInfo}
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketInfo.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setMarketId(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setExpirationTimestamp(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setTwapStartTimestamp(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setExpirationTwapStartPriceCumulative(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setSettlementPrice(value);
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
proto.injective.exchange.v1beta1.ExpiryFuturesMarketInfo.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.exchange.v1beta1.ExpiryFuturesMarketInfo.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.exchange.v1beta1.ExpiryFuturesMarketInfo} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketInfo.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getMarketId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getExpirationTimestamp();
  if (f !== 0) {
    writer.writeInt64(
      2,
      f
    );
  }
  f = message.getTwapStartTimestamp();
  if (f !== 0) {
    writer.writeInt64(
      3,
      f
    );
  }
  f = message.getExpirationTwapStartPriceCumulative();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getSettlementPrice();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
};


/**
 * optional string market_id = 1;
 * @return {string}
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketInfo.prototype.getMarketId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.ExpiryFuturesMarketInfo} returns this
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketInfo.prototype.setMarketId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional int64 expiration_timestamp = 2;
 * @return {number}
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketInfo.prototype.getExpirationTimestamp = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.exchange.v1beta1.ExpiryFuturesMarketInfo} returns this
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketInfo.prototype.setExpirationTimestamp = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional int64 twap_start_timestamp = 3;
 * @return {number}
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketInfo.prototype.getTwapStartTimestamp = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.exchange.v1beta1.ExpiryFuturesMarketInfo} returns this
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketInfo.prototype.setTwapStartTimestamp = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional string expiration_twap_start_price_cumulative = 4;
 * @return {string}
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketInfo.prototype.getExpirationTwapStartPriceCumulative = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.ExpiryFuturesMarketInfo} returns this
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketInfo.prototype.setExpirationTwapStartPriceCumulative = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string settlement_price = 5;
 * @return {string}
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketInfo.prototype.getSettlementPrice = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.ExpiryFuturesMarketInfo} returns this
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketInfo.prototype.setSettlementPrice = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};

