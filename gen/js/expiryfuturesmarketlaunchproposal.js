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

goog.provide('proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');

goog.forwardDeclare('proto.injective.oracle.v1beta1.OracleType');
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
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.displayName = 'proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal';
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
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.toObject = function(includeInstance, msg) {
  var f, obj = {
    title: jspb.Message.getFieldWithDefault(msg, 1, ""),
    description: jspb.Message.getFieldWithDefault(msg, 2, ""),
    ticker: jspb.Message.getFieldWithDefault(msg, 3, ""),
    quoteDenom: jspb.Message.getFieldWithDefault(msg, 4, ""),
    oracleBase: jspb.Message.getFieldWithDefault(msg, 5, ""),
    oracleQuote: jspb.Message.getFieldWithDefault(msg, 6, ""),
    oracleScaleFactor: jspb.Message.getFieldWithDefault(msg, 7, 0),
    oracleType: jspb.Message.getFieldWithDefault(msg, 8, 0),
    expiry: jspb.Message.getFieldWithDefault(msg, 9, 0),
    initialMarginRatio: jspb.Message.getFieldWithDefault(msg, 10, ""),
    maintenanceMarginRatio: jspb.Message.getFieldWithDefault(msg, 11, ""),
    makerFeeRate: jspb.Message.getFieldWithDefault(msg, 12, ""),
    takerFeeRate: jspb.Message.getFieldWithDefault(msg, 13, ""),
    minPriceTickSize: jspb.Message.getFieldWithDefault(msg, 14, ""),
    minQuantityTickSize: jspb.Message.getFieldWithDefault(msg, 15, "")
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
 * @return {!proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal}
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal;
  return proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal}
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.deserializeBinaryFromReader = function(msg, reader) {
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
      msg.setTicker(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setQuoteDenom(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setOracleBase(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setOracleQuote(value);
      break;
    case 7:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setOracleScaleFactor(value);
      break;
    case 8:
      var value = /** @type {!proto.injective.oracle.v1beta1.OracleType} */ (reader.readEnum());
      msg.setOracleType(value);
      break;
    case 9:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setExpiry(value);
      break;
    case 10:
      var value = /** @type {string} */ (reader.readString());
      msg.setInitialMarginRatio(value);
      break;
    case 11:
      var value = /** @type {string} */ (reader.readString());
      msg.setMaintenanceMarginRatio(value);
      break;
    case 12:
      var value = /** @type {string} */ (reader.readString());
      msg.setMakerFeeRate(value);
      break;
    case 13:
      var value = /** @type {string} */ (reader.readString());
      msg.setTakerFeeRate(value);
      break;
    case 14:
      var value = /** @type {string} */ (reader.readString());
      msg.setMinPriceTickSize(value);
      break;
    case 15:
      var value = /** @type {string} */ (reader.readString());
      msg.setMinQuantityTickSize(value);
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
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.serializeBinaryToWriter = function(message, writer) {
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
  f = message.getTicker();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getQuoteDenom();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getOracleBase();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getOracleQuote();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getOracleScaleFactor();
  if (f !== 0) {
    writer.writeUint32(
      7,
      f
    );
  }
  f = message.getOracleType();
  if (f !== 0.0) {
    writer.writeEnum(
      8,
      f
    );
  }
  f = message.getExpiry();
  if (f !== 0) {
    writer.writeInt64(
      9,
      f
    );
  }
  f = message.getInitialMarginRatio();
  if (f.length > 0) {
    writer.writeString(
      10,
      f
    );
  }
  f = message.getMaintenanceMarginRatio();
  if (f.length > 0) {
    writer.writeString(
      11,
      f
    );
  }
  f = message.getMakerFeeRate();
  if (f.length > 0) {
    writer.writeString(
      12,
      f
    );
  }
  f = message.getTakerFeeRate();
  if (f.length > 0) {
    writer.writeString(
      13,
      f
    );
  }
  f = message.getMinPriceTickSize();
  if (f.length > 0) {
    writer.writeString(
      14,
      f
    );
  }
  f = message.getMinQuantityTickSize();
  if (f.length > 0) {
    writer.writeString(
      15,
      f
    );
  }
};


/**
 * optional string title = 1;
 * @return {string}
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.prototype.getTitle = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal} returns this
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.prototype.setTitle = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string description = 2;
 * @return {string}
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.prototype.getDescription = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal} returns this
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.prototype.setDescription = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string ticker = 3;
 * @return {string}
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.prototype.getTicker = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal} returns this
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.prototype.setTicker = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string quote_denom = 4;
 * @return {string}
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.prototype.getQuoteDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal} returns this
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.prototype.setQuoteDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string oracle_base = 5;
 * @return {string}
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.prototype.getOracleBase = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal} returns this
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.prototype.setOracleBase = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string oracle_quote = 6;
 * @return {string}
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.prototype.getOracleQuote = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal} returns this
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.prototype.setOracleQuote = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional uint32 oracle_scale_factor = 7;
 * @return {number}
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.prototype.getOracleScaleFactor = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 7, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal} returns this
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.prototype.setOracleScaleFactor = function(value) {
  return jspb.Message.setProto3IntField(this, 7, value);
};


/**
 * optional injective.oracle.v1beta1.OracleType oracle_type = 8;
 * @return {!proto.injective.oracle.v1beta1.OracleType}
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.prototype.getOracleType = function() {
  return /** @type {!proto.injective.oracle.v1beta1.OracleType} */ (jspb.Message.getFieldWithDefault(this, 8, 0));
};


/**
 * @param {!proto.injective.oracle.v1beta1.OracleType} value
 * @return {!proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal} returns this
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.prototype.setOracleType = function(value) {
  return jspb.Message.setProto3EnumField(this, 8, value);
};


/**
 * optional int64 expiry = 9;
 * @return {number}
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.prototype.getExpiry = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 9, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal} returns this
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.prototype.setExpiry = function(value) {
  return jspb.Message.setProto3IntField(this, 9, value);
};


/**
 * optional string initial_margin_ratio = 10;
 * @return {string}
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.prototype.getInitialMarginRatio = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 10, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal} returns this
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.prototype.setInitialMarginRatio = function(value) {
  return jspb.Message.setProto3StringField(this, 10, value);
};


/**
 * optional string maintenance_margin_ratio = 11;
 * @return {string}
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.prototype.getMaintenanceMarginRatio = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 11, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal} returns this
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.prototype.setMaintenanceMarginRatio = function(value) {
  return jspb.Message.setProto3StringField(this, 11, value);
};


/**
 * optional string maker_fee_rate = 12;
 * @return {string}
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.prototype.getMakerFeeRate = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 12, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal} returns this
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.prototype.setMakerFeeRate = function(value) {
  return jspb.Message.setProto3StringField(this, 12, value);
};


/**
 * optional string taker_fee_rate = 13;
 * @return {string}
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.prototype.getTakerFeeRate = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 13, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal} returns this
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.prototype.setTakerFeeRate = function(value) {
  return jspb.Message.setProto3StringField(this, 13, value);
};


/**
 * optional string min_price_tick_size = 14;
 * @return {string}
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.prototype.getMinPriceTickSize = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 14, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal} returns this
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.prototype.setMinPriceTickSize = function(value) {
  return jspb.Message.setProto3StringField(this, 14, value);
};


/**
 * optional string min_quantity_tick_size = 15;
 * @return {string}
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.prototype.getMinQuantityTickSize = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 15, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal} returns this
 */
proto.injective.exchange.v1beta1.ExpiryFuturesMarketLaunchProposal.prototype.setMinQuantityTickSize = function(value) {
  return jspb.Message.setProto3StringField(this, 15, value);
};


