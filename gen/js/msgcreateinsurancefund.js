// source: injective/insurance/v1beta1/tx.proto
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

goog.provide('proto.injective.insurance.v1beta1.MsgCreateInsuranceFund');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');

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
proto.injective.insurance.v1beta1.MsgCreateInsuranceFund = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.injective.insurance.v1beta1.MsgCreateInsuranceFund, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.insurance.v1beta1.MsgCreateInsuranceFund.displayName = 'proto.injective.insurance.v1beta1.MsgCreateInsuranceFund';
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
proto.injective.insurance.v1beta1.MsgCreateInsuranceFund.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.insurance.v1beta1.MsgCreateInsuranceFund.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.insurance.v1beta1.MsgCreateInsuranceFund} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.insurance.v1beta1.MsgCreateInsuranceFund.toObject = function(includeInstance, msg) {
  var f, obj = {
    sender: jspb.Message.getFieldWithDefault(msg, 1, ""),
    ticker: jspb.Message.getFieldWithDefault(msg, 2, ""),
    quoteDenom: jspb.Message.getFieldWithDefault(msg, 3, ""),
    oracleBase: jspb.Message.getFieldWithDefault(msg, 4, ""),
    oracleQuote: jspb.Message.getFieldWithDefault(msg, 5, ""),
    oracleType: jspb.Message.getFieldWithDefault(msg, 6, 0),
    expiry: jspb.Message.getFieldWithDefault(msg, 7, 0),
    initialDeposit: (f = msg.getInitialDeposit()) && proto.cosmos.base.v1beta1.Coin.toObject(includeInstance, f)
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
 * @return {!proto.injective.insurance.v1beta1.MsgCreateInsuranceFund}
 */
proto.injective.insurance.v1beta1.MsgCreateInsuranceFund.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.insurance.v1beta1.MsgCreateInsuranceFund;
  return proto.injective.insurance.v1beta1.MsgCreateInsuranceFund.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.insurance.v1beta1.MsgCreateInsuranceFund} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.insurance.v1beta1.MsgCreateInsuranceFund}
 */
proto.injective.insurance.v1beta1.MsgCreateInsuranceFund.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setSender(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setTicker(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setQuoteDenom(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setOracleBase(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setOracleQuote(value);
      break;
    case 6:
      var value = /** @type {!proto.injective.oracle.v1beta1.OracleType} */ (reader.readEnum());
      msg.setOracleType(value);
      break;
    case 7:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setExpiry(value);
      break;
    case 8:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.setInitialDeposit(value);
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
proto.injective.insurance.v1beta1.MsgCreateInsuranceFund.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.insurance.v1beta1.MsgCreateInsuranceFund.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.insurance.v1beta1.MsgCreateInsuranceFund} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.insurance.v1beta1.MsgCreateInsuranceFund.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSender();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getTicker();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getQuoteDenom();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getOracleBase();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getOracleQuote();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getOracleType();
  if (f !== 0.0) {
    writer.writeEnum(
      6,
      f
    );
  }
  f = message.getExpiry();
  if (f !== 0) {
    writer.writeInt64(
      7,
      f
    );
  }
  f = message.getInitialDeposit();
  if (f != null) {
    writer.writeMessage(
      8,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
};


/**
 * optional string sender = 1;
 * @return {string}
 */
proto.injective.insurance.v1beta1.MsgCreateInsuranceFund.prototype.getSender = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.insurance.v1beta1.MsgCreateInsuranceFund} returns this
 */
proto.injective.insurance.v1beta1.MsgCreateInsuranceFund.prototype.setSender = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string ticker = 2;
 * @return {string}
 */
proto.injective.insurance.v1beta1.MsgCreateInsuranceFund.prototype.getTicker = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.insurance.v1beta1.MsgCreateInsuranceFund} returns this
 */
proto.injective.insurance.v1beta1.MsgCreateInsuranceFund.prototype.setTicker = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string quote_denom = 3;
 * @return {string}
 */
proto.injective.insurance.v1beta1.MsgCreateInsuranceFund.prototype.getQuoteDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.insurance.v1beta1.MsgCreateInsuranceFund} returns this
 */
proto.injective.insurance.v1beta1.MsgCreateInsuranceFund.prototype.setQuoteDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string oracle_base = 4;
 * @return {string}
 */
proto.injective.insurance.v1beta1.MsgCreateInsuranceFund.prototype.getOracleBase = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.insurance.v1beta1.MsgCreateInsuranceFund} returns this
 */
proto.injective.insurance.v1beta1.MsgCreateInsuranceFund.prototype.setOracleBase = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string oracle_quote = 5;
 * @return {string}
 */
proto.injective.insurance.v1beta1.MsgCreateInsuranceFund.prototype.getOracleQuote = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.insurance.v1beta1.MsgCreateInsuranceFund} returns this
 */
proto.injective.insurance.v1beta1.MsgCreateInsuranceFund.prototype.setOracleQuote = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional injective.oracle.v1beta1.OracleType oracle_type = 6;
 * @return {!proto.injective.oracle.v1beta1.OracleType}
 */
proto.injective.insurance.v1beta1.MsgCreateInsuranceFund.prototype.getOracleType = function() {
  return /** @type {!proto.injective.oracle.v1beta1.OracleType} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {!proto.injective.oracle.v1beta1.OracleType} value
 * @return {!proto.injective.insurance.v1beta1.MsgCreateInsuranceFund} returns this
 */
proto.injective.insurance.v1beta1.MsgCreateInsuranceFund.prototype.setOracleType = function(value) {
  return jspb.Message.setProto3EnumField(this, 6, value);
};


/**
 * optional int64 expiry = 7;
 * @return {number}
 */
proto.injective.insurance.v1beta1.MsgCreateInsuranceFund.prototype.getExpiry = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 7, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.insurance.v1beta1.MsgCreateInsuranceFund} returns this
 */
proto.injective.insurance.v1beta1.MsgCreateInsuranceFund.prototype.setExpiry = function(value) {
  return jspb.Message.setProto3IntField(this, 7, value);
};


/**
 * optional cosmos.base.v1beta1.Coin initial_deposit = 8;
 * @return {?proto.cosmos.base.v1beta1.Coin}
 */
proto.injective.insurance.v1beta1.MsgCreateInsuranceFund.prototype.getInitialDeposit = function() {
  return /** @type{?proto.cosmos.base.v1beta1.Coin} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.v1beta1.Coin, 8));
};


/**
 * @param {?proto.cosmos.base.v1beta1.Coin|undefined} value
 * @return {!proto.injective.insurance.v1beta1.MsgCreateInsuranceFund} returns this
*/
proto.injective.insurance.v1beta1.MsgCreateInsuranceFund.prototype.setInitialDeposit = function(value) {
  return jspb.Message.setWrapperField(this, 8, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.injective.insurance.v1beta1.MsgCreateInsuranceFund} returns this
 */
proto.injective.insurance.v1beta1.MsgCreateInsuranceFund.prototype.clearInitialDeposit = function() {
  return this.setInitialDeposit(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.injective.insurance.v1beta1.MsgCreateInsuranceFund.prototype.hasInitialDeposit = function() {
  return jspb.Message.getField(this, 8) != null;
};


