// source: injective/exchange/v1beta1/tx.proto
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

goog.provide('proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

goog.forwardDeclare('proto.injective.exchange.v1beta1.MarketStatus');
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
proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal.displayName = 'proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal';
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
proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal.toObject = function(includeInstance, msg) {
  var f, obj = {
    title: jspb.Message.getFieldWithDefault(msg, 1, ""),
    description: jspb.Message.getFieldWithDefault(msg, 2, ""),
    marketId: jspb.Message.getFieldWithDefault(msg, 3, ""),
    makerFeeRate: jspb.Message.getFieldWithDefault(msg, 4, ""),
    takerFeeRate: jspb.Message.getFieldWithDefault(msg, 5, ""),
    relayerFeeShareRate: jspb.Message.getFieldWithDefault(msg, 6, ""),
    minPriceTickSize: jspb.Message.getFieldWithDefault(msg, 7, ""),
    minQuantityTickSize: jspb.Message.getFieldWithDefault(msg, 8, ""),
    status: jspb.Message.getFieldWithDefault(msg, 9, 0)
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
 * @return {!proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal}
 */
proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal;
  return proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal}
 */
proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setTitle(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDescription(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setMarketId(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setMakerFeeRate(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setTakerFeeRate(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setRelayerFeeShareRate(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setMinPriceTickSize(value);
      break;
    case 8:
      var value = /** @type {string} */ (reader.readString());
      msg.setMinQuantityTickSize(value);
      break;
    case 9:
      var value = /** @type {!proto.injective.exchange.v1beta1.MarketStatus} */ (reader.readEnum());
      msg.setStatus(value);
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
proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getTitle();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDescription();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getMarketId();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getMakerFeeRate();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getTakerFeeRate();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getRelayerFeeShareRate();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getMinPriceTickSize();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
  f = message.getMinQuantityTickSize();
  if (f.length > 0) {
    writer.writeString(
      8,
      f
    );
  }
  f = message.getStatus();
  if (f !== 0.0) {
    writer.writeEnum(
      9,
      f
    );
  }
};


/**
 * optional string title = 1;
 * @return {string}
 */
proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal.prototype.getTitle = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal} returns this
 */
proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal.prototype.setTitle = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string description = 2;
 * @return {string}
 */
proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal} returns this
 */
proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string market_id = 3;
 * @return {string}
 */
proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal.prototype.getMarketId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal} returns this
 */
proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal.prototype.setMarketId = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string maker_fee_rate = 4;
 * @return {string}
 */
proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal.prototype.getMakerFeeRate = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal} returns this
 */
proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal.prototype.setMakerFeeRate = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string taker_fee_rate = 5;
 * @return {string}
 */
proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal.prototype.getTakerFeeRate = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal} returns this
 */
proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal.prototype.setTakerFeeRate = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string relayer_fee_share_rate = 6;
 * @return {string}
 */
proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal.prototype.getRelayerFeeShareRate = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal} returns this
 */
proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal.prototype.setRelayerFeeShareRate = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional string min_price_tick_size = 7;
 * @return {string}
 */
proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal.prototype.getMinPriceTickSize = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal} returns this
 */
proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal.prototype.setMinPriceTickSize = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


/**
 * optional string min_quantity_tick_size = 8;
 * @return {string}
 */
proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal.prototype.getMinQuantityTickSize = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal} returns this
 */
proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal.prototype.setMinQuantityTickSize = function(value) {
  return jspb.Message.setProto3StringField(this, 8, value);
};


/**
 * optional MarketStatus status = 9;
 * @return {!proto.injective.exchange.v1beta1.MarketStatus}
 */
proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal.prototype.getStatus = function() {
  return /** @type {!proto.injective.exchange.v1beta1.MarketStatus} */ (jspb.Message.getFieldWithDefault(this, 9, 0));
};


/**
 * @param {!proto.injective.exchange.v1beta1.MarketStatus} value
 * @return {!proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal} returns this
 */
proto.injective.exchange.v1beta1.SpotMarketParamUpdateProposal.prototype.setStatus = function(value) {
  return jspb.Message.setProto3EnumField(this, 9, value);
};


