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

goog.provide('proto.injective.exchange.v1beta1.ProviderOracleParams');

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
proto.injective.exchange.v1beta1.ProviderOracleParams = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.injective.exchange.v1beta1.ProviderOracleParams, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.injective.exchange.v1beta1.ProviderOracleParams.displayName = 'proto.injective.exchange.v1beta1.ProviderOracleParams';
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
proto.injective.exchange.v1beta1.ProviderOracleParams.prototype.toObject = function(opt_includeInstance) {
  return proto.injective.exchange.v1beta1.ProviderOracleParams.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.injective.exchange.v1beta1.ProviderOracleParams} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.ProviderOracleParams.toObject = function(includeInstance, msg) {
  var f, obj = {
    symbol: jspb.Message.getFieldWithDefault(msg, 1, ""),
    provider: jspb.Message.getFieldWithDefault(msg, 2, ""),
    oracleScaleFactor: jspb.Message.getFieldWithDefault(msg, 3, 0),
    oracleType: jspb.Message.getFieldWithDefault(msg, 4, 0)
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
 * @return {!proto.injective.exchange.v1beta1.ProviderOracleParams}
 */
proto.injective.exchange.v1beta1.ProviderOracleParams.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.injective.exchange.v1beta1.ProviderOracleParams;
  return proto.injective.exchange.v1beta1.ProviderOracleParams.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.injective.exchange.v1beta1.ProviderOracleParams} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.injective.exchange.v1beta1.ProviderOracleParams}
 */
proto.injective.exchange.v1beta1.ProviderOracleParams.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setSymbol(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setProvider(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setOracleScaleFactor(value);
      break;
    case 4:
      var value = /** @type {!proto.injective.oracle.v1beta1.OracleType} */ (reader.readEnum());
      msg.setOracleType(value);
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
proto.injective.exchange.v1beta1.ProviderOracleParams.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.injective.exchange.v1beta1.ProviderOracleParams.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.injective.exchange.v1beta1.ProviderOracleParams} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.injective.exchange.v1beta1.ProviderOracleParams.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSymbol();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getProvider();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getOracleScaleFactor();
  if (f !== 0) {
    writer.writeUint32(
      3,
      f
    );
  }
  f = message.getOracleType();
  if (f !== 0.0) {
    writer.writeEnum(
      4,
      f
    );
  }
};


/**
 * optional string symbol = 1;
 * @return {string}
 */
proto.injective.exchange.v1beta1.ProviderOracleParams.prototype.getSymbol = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.ProviderOracleParams} returns this
 */
proto.injective.exchange.v1beta1.ProviderOracleParams.prototype.setSymbol = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string provider = 2;
 * @return {string}
 */
proto.injective.exchange.v1beta1.ProviderOracleParams.prototype.getProvider = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.injective.exchange.v1beta1.ProviderOracleParams} returns this
 */
proto.injective.exchange.v1beta1.ProviderOracleParams.prototype.setProvider = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional uint32 oracle_scale_factor = 3;
 * @return {number}
 */
proto.injective.exchange.v1beta1.ProviderOracleParams.prototype.getOracleScaleFactor = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.injective.exchange.v1beta1.ProviderOracleParams} returns this
 */
proto.injective.exchange.v1beta1.ProviderOracleParams.prototype.setOracleScaleFactor = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional injective.oracle.v1beta1.OracleType oracle_type = 4;
 * @return {!proto.injective.oracle.v1beta1.OracleType}
 */
proto.injective.exchange.v1beta1.ProviderOracleParams.prototype.getOracleType = function() {
  return /** @type {!proto.injective.oracle.v1beta1.OracleType} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {!proto.injective.oracle.v1beta1.OracleType} value
 * @return {!proto.injective.exchange.v1beta1.ProviderOracleParams} returns this
 */
proto.injective.exchange.v1beta1.ProviderOracleParams.prototype.setOracleType = function(value) {
  return jspb.Message.setProto3EnumField(this, 4, value);
};

