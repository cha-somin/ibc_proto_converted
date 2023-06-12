// source: desmos/profiles/v2/models_params.proto
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

goog.provide('proto.desmos.profiles.v2.OracleParams');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.v1beta1.Coin');

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
proto.desmos.profiles.v2.OracleParams = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.desmos.profiles.v2.OracleParams.repeatedFields_, null);
};
goog.inherits(proto.desmos.profiles.v2.OracleParams, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.desmos.profiles.v2.OracleParams.displayName = 'proto.desmos.profiles.v2.OracleParams';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.desmos.profiles.v2.OracleParams.repeatedFields_ = [6];



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
proto.desmos.profiles.v2.OracleParams.prototype.toObject = function(opt_includeInstance) {
  return proto.desmos.profiles.v2.OracleParams.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.desmos.profiles.v2.OracleParams} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.profiles.v2.OracleParams.toObject = function(includeInstance, msg) {
  var f, obj = {
    scriptId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    askCount: jspb.Message.getFieldWithDefault(msg, 2, 0),
    minCount: jspb.Message.getFieldWithDefault(msg, 3, 0),
    prepareGas: jspb.Message.getFieldWithDefault(msg, 4, 0),
    executeGas: jspb.Message.getFieldWithDefault(msg, 5, 0),
    feeAmountList: jspb.Message.toObjectList(msg.getFeeAmountList(),
    proto.cosmos.base.v1beta1.Coin.toObject, includeInstance)
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
 * @return {!proto.desmos.profiles.v2.OracleParams}
 */
proto.desmos.profiles.v2.OracleParams.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.desmos.profiles.v2.OracleParams;
  return proto.desmos.profiles.v2.OracleParams.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.desmos.profiles.v2.OracleParams} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.desmos.profiles.v2.OracleParams}
 */
proto.desmos.profiles.v2.OracleParams.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setScriptId(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setAskCount(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setMinCount(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setPrepareGas(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setExecuteGas(value);
      break;
    case 6:
      var value = new proto.cosmos.base.v1beta1.Coin;
      reader.readMessage(value,proto.cosmos.base.v1beta1.Coin.deserializeBinaryFromReader);
      msg.addFeeAmount(value);
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
proto.desmos.profiles.v2.OracleParams.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.desmos.profiles.v2.OracleParams.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.desmos.profiles.v2.OracleParams} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.profiles.v2.OracleParams.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getScriptId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getAskCount();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getMinCount();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getPrepareGas();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
  f = message.getExecuteGas();
  if (f !== 0) {
    writer.writeUint64(
      5,
      f
    );
  }
  f = message.getFeeAmountList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      6,
      f,
      proto.cosmos.base.v1beta1.Coin.serializeBinaryToWriter
    );
  }
};


/**
 * optional uint64 script_id = 1;
 * @return {number}
 */
proto.desmos.profiles.v2.OracleParams.prototype.getScriptId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.desmos.profiles.v2.OracleParams} returns this
 */
proto.desmos.profiles.v2.OracleParams.prototype.setScriptId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint64 ask_count = 2;
 * @return {number}
 */
proto.desmos.profiles.v2.OracleParams.prototype.getAskCount = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.desmos.profiles.v2.OracleParams} returns this
 */
proto.desmos.profiles.v2.OracleParams.prototype.setAskCount = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional uint64 min_count = 3;
 * @return {number}
 */
proto.desmos.profiles.v2.OracleParams.prototype.getMinCount = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.desmos.profiles.v2.OracleParams} returns this
 */
proto.desmos.profiles.v2.OracleParams.prototype.setMinCount = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional uint64 prepare_gas = 4;
 * @return {number}
 */
proto.desmos.profiles.v2.OracleParams.prototype.getPrepareGas = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.desmos.profiles.v2.OracleParams} returns this
 */
proto.desmos.profiles.v2.OracleParams.prototype.setPrepareGas = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional uint64 execute_gas = 5;
 * @return {number}
 */
proto.desmos.profiles.v2.OracleParams.prototype.getExecuteGas = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.desmos.profiles.v2.OracleParams} returns this
 */
proto.desmos.profiles.v2.OracleParams.prototype.setExecuteGas = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * repeated cosmos.base.v1beta1.Coin fee_amount = 6;
 * @return {!Array<!proto.cosmos.base.v1beta1.Coin>}
 */
proto.desmos.profiles.v2.OracleParams.prototype.getFeeAmountList = function() {
  return /** @type{!Array<!proto.cosmos.base.v1beta1.Coin>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.base.v1beta1.Coin, 6));
};


/**
 * @param {!Array<!proto.cosmos.base.v1beta1.Coin>} value
 * @return {!proto.desmos.profiles.v2.OracleParams} returns this
*/
proto.desmos.profiles.v2.OracleParams.prototype.setFeeAmountList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 6, value);
};


/**
 * @param {!proto.cosmos.base.v1beta1.Coin=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.base.v1beta1.Coin}
 */
proto.desmos.profiles.v2.OracleParams.prototype.addFeeAmount = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 6, opt_value, proto.cosmos.base.v1beta1.Coin, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.desmos.profiles.v2.OracleParams} returns this
 */
proto.desmos.profiles.v2.OracleParams.prototype.clearFeeAmountList = function() {
  return this.setFeeAmountList([]);
};


