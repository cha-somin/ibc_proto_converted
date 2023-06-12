// source: coreum/feemodel/v1/params.proto
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

goog.provide('proto.coreum.feemodel.v1.ModelParams');

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
proto.coreum.feemodel.v1.ModelParams = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.coreum.feemodel.v1.ModelParams, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.coreum.feemodel.v1.ModelParams.displayName = 'proto.coreum.feemodel.v1.ModelParams';
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
proto.coreum.feemodel.v1.ModelParams.prototype.toObject = function(opt_includeInstance) {
  return proto.coreum.feemodel.v1.ModelParams.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.coreum.feemodel.v1.ModelParams} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.coreum.feemodel.v1.ModelParams.toObject = function(includeInstance, msg) {
  var f, obj = {
    initialGasPrice: jspb.Message.getFieldWithDefault(msg, 1, ""),
    maxGasPriceMultiplier: jspb.Message.getFieldWithDefault(msg, 2, ""),
    maxDiscount: jspb.Message.getFieldWithDefault(msg, 3, ""),
    escalationStartFraction: jspb.Message.getFieldWithDefault(msg, 4, ""),
    maxBlockGas: jspb.Message.getFieldWithDefault(msg, 5, 0),
    shortEmaBlockLength: jspb.Message.getFieldWithDefault(msg, 6, 0),
    longEmaBlockLength: jspb.Message.getFieldWithDefault(msg, 7, 0)
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
 * @return {!proto.coreum.feemodel.v1.ModelParams}
 */
proto.coreum.feemodel.v1.ModelParams.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.coreum.feemodel.v1.ModelParams;
  return proto.coreum.feemodel.v1.ModelParams.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.coreum.feemodel.v1.ModelParams} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.coreum.feemodel.v1.ModelParams}
 */
proto.coreum.feemodel.v1.ModelParams.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setInitialGasPrice(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setMaxGasPriceMultiplier(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setMaxDiscount(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setEscalationStartFraction(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setMaxBlockGas(value);
      break;
    case 6:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setShortEmaBlockLength(value);
      break;
    case 7:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setLongEmaBlockLength(value);
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
proto.coreum.feemodel.v1.ModelParams.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.coreum.feemodel.v1.ModelParams.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.coreum.feemodel.v1.ModelParams} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.coreum.feemodel.v1.ModelParams.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getInitialGasPrice();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getMaxGasPriceMultiplier();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getMaxDiscount();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getEscalationStartFraction();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getMaxBlockGas();
  if (f !== 0) {
    writer.writeInt64(
      5,
      f
    );
  }
  f = message.getShortEmaBlockLength();
  if (f !== 0) {
    writer.writeUint32(
      6,
      f
    );
  }
  f = message.getLongEmaBlockLength();
  if (f !== 0) {
    writer.writeUint32(
      7,
      f
    );
  }
};


/**
 * optional string initial_gas_price = 1;
 * @return {string}
 */
proto.coreum.feemodel.v1.ModelParams.prototype.getInitialGasPrice = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.coreum.feemodel.v1.ModelParams} returns this
 */
proto.coreum.feemodel.v1.ModelParams.prototype.setInitialGasPrice = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string max_gas_price_multiplier = 2;
 * @return {string}
 */
proto.coreum.feemodel.v1.ModelParams.prototype.getMaxGasPriceMultiplier = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.coreum.feemodel.v1.ModelParams} returns this
 */
proto.coreum.feemodel.v1.ModelParams.prototype.setMaxGasPriceMultiplier = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string max_discount = 3;
 * @return {string}
 */
proto.coreum.feemodel.v1.ModelParams.prototype.getMaxDiscount = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.coreum.feemodel.v1.ModelParams} returns this
 */
proto.coreum.feemodel.v1.ModelParams.prototype.setMaxDiscount = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string escalation_start_fraction = 4;
 * @return {string}
 */
proto.coreum.feemodel.v1.ModelParams.prototype.getEscalationStartFraction = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.coreum.feemodel.v1.ModelParams} returns this
 */
proto.coreum.feemodel.v1.ModelParams.prototype.setEscalationStartFraction = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional int64 max_block_gas = 5;
 * @return {number}
 */
proto.coreum.feemodel.v1.ModelParams.prototype.getMaxBlockGas = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.coreum.feemodel.v1.ModelParams} returns this
 */
proto.coreum.feemodel.v1.ModelParams.prototype.setMaxBlockGas = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * optional uint32 short_ema_block_length = 6;
 * @return {number}
 */
proto.coreum.feemodel.v1.ModelParams.prototype.getShortEmaBlockLength = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {number} value
 * @return {!proto.coreum.feemodel.v1.ModelParams} returns this
 */
proto.coreum.feemodel.v1.ModelParams.prototype.setShortEmaBlockLength = function(value) {
  return jspb.Message.setProto3IntField(this, 6, value);
};


/**
 * optional uint32 long_ema_block_length = 7;
 * @return {number}
 */
proto.coreum.feemodel.v1.ModelParams.prototype.getLongEmaBlockLength = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 7, 0));
};


/**
 * @param {number} value
 * @return {!proto.coreum.feemodel.v1.ModelParams} returns this
 */
proto.coreum.feemodel.v1.ModelParams.prototype.setLongEmaBlockLength = function(value) {
  return jspb.Message.setProto3IntField(this, 7, value);
};


