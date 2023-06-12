// source: umee/leverage/v1/query.proto
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

goog.provide('proto.umee.leverage.v1.QueryMarketSummaryResponse');

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
proto.umee.leverage.v1.QueryMarketSummaryResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.umee.leverage.v1.QueryMarketSummaryResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.umee.leverage.v1.QueryMarketSummaryResponse.displayName = 'proto.umee.leverage.v1.QueryMarketSummaryResponse';
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
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.umee.leverage.v1.QueryMarketSummaryResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.umee.leverage.v1.QueryMarketSummaryResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    symbolDenom: jspb.Message.getFieldWithDefault(msg, 1, ""),
    exponent: jspb.Message.getFieldWithDefault(msg, 2, 0),
    oraclePrice: jspb.Message.getFieldWithDefault(msg, 3, ""),
    utokenExchangeRate: jspb.Message.getFieldWithDefault(msg, 4, ""),
    supplyApy: jspb.Message.getFieldWithDefault(msg, 5, ""),
    borrowApy: jspb.Message.getFieldWithDefault(msg, 6, ""),
    supplied: jspb.Message.getFieldWithDefault(msg, 7, ""),
    reserved: jspb.Message.getFieldWithDefault(msg, 8, ""),
    collateral: jspb.Message.getFieldWithDefault(msg, 9, ""),
    borrowed: jspb.Message.getFieldWithDefault(msg, 10, ""),
    liquidity: jspb.Message.getFieldWithDefault(msg, 11, ""),
    maximumBorrow: jspb.Message.getFieldWithDefault(msg, 12, ""),
    maximumCollateral: jspb.Message.getFieldWithDefault(msg, 13, ""),
    minimumLiquidity: jspb.Message.getFieldWithDefault(msg, 14, ""),
    utokenSupply: jspb.Message.getFieldWithDefault(msg, 15, ""),
    availableBorrow: jspb.Message.getFieldWithDefault(msg, 16, ""),
    availableWithdraw: jspb.Message.getFieldWithDefault(msg, 17, ""),
    availableCollateralize: jspb.Message.getFieldWithDefault(msg, 18, ""),
    oracleHistoricPrice: jspb.Message.getFieldWithDefault(msg, 19, ""),
    errors: jspb.Message.getFieldWithDefault(msg, 20, "")
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
 * @return {!proto.umee.leverage.v1.QueryMarketSummaryResponse}
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.umee.leverage.v1.QueryMarketSummaryResponse;
  return proto.umee.leverage.v1.QueryMarketSummaryResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.umee.leverage.v1.QueryMarketSummaryResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.umee.leverage.v1.QueryMarketSummaryResponse}
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setSymbolDenom(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setExponent(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setOraclePrice(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setUtokenExchangeRate(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setSupplyApy(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setBorrowApy(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.setSupplied(value);
      break;
    case 8:
      var value = /** @type {string} */ (reader.readString());
      msg.setReserved(value);
      break;
    case 9:
      var value = /** @type {string} */ (reader.readString());
      msg.setCollateral(value);
      break;
    case 10:
      var value = /** @type {string} */ (reader.readString());
      msg.setBorrowed(value);
      break;
    case 11:
      var value = /** @type {string} */ (reader.readString());
      msg.setLiquidity(value);
      break;
    case 12:
      var value = /** @type {string} */ (reader.readString());
      msg.setMaximumBorrow(value);
      break;
    case 13:
      var value = /** @type {string} */ (reader.readString());
      msg.setMaximumCollateral(value);
      break;
    case 14:
      var value = /** @type {string} */ (reader.readString());
      msg.setMinimumLiquidity(value);
      break;
    case 15:
      var value = /** @type {string} */ (reader.readString());
      msg.setUtokenSupply(value);
      break;
    case 16:
      var value = /** @type {string} */ (reader.readString());
      msg.setAvailableBorrow(value);
      break;
    case 17:
      var value = /** @type {string} */ (reader.readString());
      msg.setAvailableWithdraw(value);
      break;
    case 18:
      var value = /** @type {string} */ (reader.readString());
      msg.setAvailableCollateralize(value);
      break;
    case 19:
      var value = /** @type {string} */ (reader.readString());
      msg.setOracleHistoricPrice(value);
      break;
    case 20:
      var value = /** @type {string} */ (reader.readString());
      msg.setErrors(value);
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
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.umee.leverage.v1.QueryMarketSummaryResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.umee.leverage.v1.QueryMarketSummaryResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSymbolDenom();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getExponent();
  if (f !== 0) {
    writer.writeUint32(
      2,
      f
    );
  }
  f = message.getOraclePrice();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getUtokenExchangeRate();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getSupplyApy();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getBorrowApy();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
  f = message.getSupplied();
  if (f.length > 0) {
    writer.writeString(
      7,
      f
    );
  }
  f = message.getReserved();
  if (f.length > 0) {
    writer.writeString(
      8,
      f
    );
  }
  f = message.getCollateral();
  if (f.length > 0) {
    writer.writeString(
      9,
      f
    );
  }
  f = message.getBorrowed();
  if (f.length > 0) {
    writer.writeString(
      10,
      f
    );
  }
  f = message.getLiquidity();
  if (f.length > 0) {
    writer.writeString(
      11,
      f
    );
  }
  f = message.getMaximumBorrow();
  if (f.length > 0) {
    writer.writeString(
      12,
      f
    );
  }
  f = message.getMaximumCollateral();
  if (f.length > 0) {
    writer.writeString(
      13,
      f
    );
  }
  f = message.getMinimumLiquidity();
  if (f.length > 0) {
    writer.writeString(
      14,
      f
    );
  }
  f = message.getUtokenSupply();
  if (f.length > 0) {
    writer.writeString(
      15,
      f
    );
  }
  f = message.getAvailableBorrow();
  if (f.length > 0) {
    writer.writeString(
      16,
      f
    );
  }
  f = message.getAvailableWithdraw();
  if (f.length > 0) {
    writer.writeString(
      17,
      f
    );
  }
  f = message.getAvailableCollateralize();
  if (f.length > 0) {
    writer.writeString(
      18,
      f
    );
  }
  f = message.getOracleHistoricPrice();
  if (f.length > 0) {
    writer.writeString(
      19,
      f
    );
  }
  f = message.getErrors();
  if (f.length > 0) {
    writer.writeString(
      20,
      f
    );
  }
};


/**
 * optional string symbol_denom = 1;
 * @return {string}
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.getSymbolDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.umee.leverage.v1.QueryMarketSummaryResponse} returns this
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.setSymbolDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional uint32 exponent = 2;
 * @return {number}
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.getExponent = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.umee.leverage.v1.QueryMarketSummaryResponse} returns this
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.setExponent = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional string oracle_price = 3;
 * @return {string}
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.getOraclePrice = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.umee.leverage.v1.QueryMarketSummaryResponse} returns this
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.setOraclePrice = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string uToken_exchange_rate = 4;
 * @return {string}
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.getUtokenExchangeRate = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.umee.leverage.v1.QueryMarketSummaryResponse} returns this
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.setUtokenExchangeRate = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string supply_APY = 5;
 * @return {string}
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.getSupplyApy = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.umee.leverage.v1.QueryMarketSummaryResponse} returns this
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.setSupplyApy = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional string borrow_APY = 6;
 * @return {string}
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.getBorrowApy = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.umee.leverage.v1.QueryMarketSummaryResponse} returns this
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.setBorrowApy = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};


/**
 * optional string supplied = 7;
 * @return {string}
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.getSupplied = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 7, ""));
};


/**
 * @param {string} value
 * @return {!proto.umee.leverage.v1.QueryMarketSummaryResponse} returns this
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.setSupplied = function(value) {
  return jspb.Message.setProto3StringField(this, 7, value);
};


/**
 * optional string reserved = 8;
 * @return {string}
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.getReserved = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * @param {string} value
 * @return {!proto.umee.leverage.v1.QueryMarketSummaryResponse} returns this
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.setReserved = function(value) {
  return jspb.Message.setProto3StringField(this, 8, value);
};


/**
 * optional string collateral = 9;
 * @return {string}
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.getCollateral = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 9, ""));
};


/**
 * @param {string} value
 * @return {!proto.umee.leverage.v1.QueryMarketSummaryResponse} returns this
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.setCollateral = function(value) {
  return jspb.Message.setProto3StringField(this, 9, value);
};


/**
 * optional string borrowed = 10;
 * @return {string}
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.getBorrowed = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 10, ""));
};


/**
 * @param {string} value
 * @return {!proto.umee.leverage.v1.QueryMarketSummaryResponse} returns this
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.setBorrowed = function(value) {
  return jspb.Message.setProto3StringField(this, 10, value);
};


/**
 * optional string liquidity = 11;
 * @return {string}
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.getLiquidity = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 11, ""));
};


/**
 * @param {string} value
 * @return {!proto.umee.leverage.v1.QueryMarketSummaryResponse} returns this
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.setLiquidity = function(value) {
  return jspb.Message.setProto3StringField(this, 11, value);
};


/**
 * optional string maximum_borrow = 12;
 * @return {string}
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.getMaximumBorrow = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 12, ""));
};


/**
 * @param {string} value
 * @return {!proto.umee.leverage.v1.QueryMarketSummaryResponse} returns this
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.setMaximumBorrow = function(value) {
  return jspb.Message.setProto3StringField(this, 12, value);
};


/**
 * optional string maximum_collateral = 13;
 * @return {string}
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.getMaximumCollateral = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 13, ""));
};


/**
 * @param {string} value
 * @return {!proto.umee.leverage.v1.QueryMarketSummaryResponse} returns this
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.setMaximumCollateral = function(value) {
  return jspb.Message.setProto3StringField(this, 13, value);
};


/**
 * optional string minimum_liquidity = 14;
 * @return {string}
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.getMinimumLiquidity = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 14, ""));
};


/**
 * @param {string} value
 * @return {!proto.umee.leverage.v1.QueryMarketSummaryResponse} returns this
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.setMinimumLiquidity = function(value) {
  return jspb.Message.setProto3StringField(this, 14, value);
};


/**
 * optional string uToken_supply = 15;
 * @return {string}
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.getUtokenSupply = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 15, ""));
};


/**
 * @param {string} value
 * @return {!proto.umee.leverage.v1.QueryMarketSummaryResponse} returns this
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.setUtokenSupply = function(value) {
  return jspb.Message.setProto3StringField(this, 15, value);
};


/**
 * optional string available_borrow = 16;
 * @return {string}
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.getAvailableBorrow = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 16, ""));
};


/**
 * @param {string} value
 * @return {!proto.umee.leverage.v1.QueryMarketSummaryResponse} returns this
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.setAvailableBorrow = function(value) {
  return jspb.Message.setProto3StringField(this, 16, value);
};


/**
 * optional string available_withdraw = 17;
 * @return {string}
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.getAvailableWithdraw = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 17, ""));
};


/**
 * @param {string} value
 * @return {!proto.umee.leverage.v1.QueryMarketSummaryResponse} returns this
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.setAvailableWithdraw = function(value) {
  return jspb.Message.setProto3StringField(this, 17, value);
};


/**
 * optional string available_collateralize = 18;
 * @return {string}
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.getAvailableCollateralize = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 18, ""));
};


/**
 * @param {string} value
 * @return {!proto.umee.leverage.v1.QueryMarketSummaryResponse} returns this
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.setAvailableCollateralize = function(value) {
  return jspb.Message.setProto3StringField(this, 18, value);
};


/**
 * optional string oracle_historic_price = 19;
 * @return {string}
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.getOracleHistoricPrice = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 19, ""));
};


/**
 * @param {string} value
 * @return {!proto.umee.leverage.v1.QueryMarketSummaryResponse} returns this
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.setOracleHistoricPrice = function(value) {
  return jspb.Message.setProto3StringField(this, 19, value);
};


/**
 * optional string errors = 20;
 * @return {string}
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.getErrors = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 20, ""));
};


/**
 * @param {string} value
 * @return {!proto.umee.leverage.v1.QueryMarketSummaryResponse} returns this
 */
proto.umee.leverage.v1.QueryMarketSummaryResponse.prototype.setErrors = function(value) {
  return jspb.Message.setProto3StringField(this, 20, value);
};


