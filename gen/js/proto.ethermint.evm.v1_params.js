// source: ethermint/evm/v1/evm.proto
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

goog.provide('proto.ethermint.evm.v1.Params');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.ethermint.evm.v1.ChainConfig');

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
proto.ethermint.evm.v1.Params = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.ethermint.evm.v1.Params.repeatedFields_, null);
};
goog.inherits(proto.ethermint.evm.v1.Params, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ethermint.evm.v1.Params.displayName = 'proto.ethermint.evm.v1.Params';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.ethermint.evm.v1.Params.repeatedFields_ = [4,7];



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
proto.ethermint.evm.v1.Params.prototype.toObject = function(opt_includeInstance) {
  return proto.ethermint.evm.v1.Params.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ethermint.evm.v1.Params} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ethermint.evm.v1.Params.toObject = function(includeInstance, msg) {
  var f, obj = {
    evmDenom: jspb.Message.getFieldWithDefault(msg, 1, ""),
    enableCreate: jspb.Message.getBooleanFieldWithDefault(msg, 2, false),
    enableCall: jspb.Message.getBooleanFieldWithDefault(msg, 3, false),
    extraEipsList: (f = jspb.Message.getRepeatedField(msg, 4)) == null ? undefined : f,
    chainConfig: (f = msg.getChainConfig()) && proto.ethermint.evm.v1.ChainConfig.toObject(includeInstance, f),
    allowUnprotectedTxs: jspb.Message.getBooleanFieldWithDefault(msg, 6, false),
    activePrecompilesList: (f = jspb.Message.getRepeatedField(msg, 7)) == null ? undefined : f
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
 * @return {!proto.ethermint.evm.v1.Params}
 */
proto.ethermint.evm.v1.Params.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ethermint.evm.v1.Params;
  return proto.ethermint.evm.v1.Params.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ethermint.evm.v1.Params} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ethermint.evm.v1.Params}
 */
proto.ethermint.evm.v1.Params.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setEvmDenom(value);
      break;
    case 2:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setEnableCreate(value);
      break;
    case 3:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setEnableCall(value);
      break;
    case 4:
      var values = /** @type {!Array<number>} */ (reader.isDelimited() ? reader.readPackedInt64() : [reader.readInt64()]);
      for (var i = 0; i < values.length; i++) {
        msg.addExtraEips(values[i]);
      }
      break;
    case 5:
      var value = new proto.ethermint.evm.v1.ChainConfig;
      reader.readMessage(value,proto.ethermint.evm.v1.ChainConfig.deserializeBinaryFromReader);
      msg.setChainConfig(value);
      break;
    case 6:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setAllowUnprotectedTxs(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.addActivePrecompiles(value);
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
proto.ethermint.evm.v1.Params.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ethermint.evm.v1.Params.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ethermint.evm.v1.Params} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ethermint.evm.v1.Params.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getEvmDenom();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getEnableCreate();
  if (f) {
    writer.writeBool(
      2,
      f
    );
  }
  f = message.getEnableCall();
  if (f) {
    writer.writeBool(
      3,
      f
    );
  }
  f = message.getExtraEipsList();
  if (f.length > 0) {
    writer.writePackedInt64(
      4,
      f
    );
  }
  f = message.getChainConfig();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.ethermint.evm.v1.ChainConfig.serializeBinaryToWriter
    );
  }
  f = message.getAllowUnprotectedTxs();
  if (f) {
    writer.writeBool(
      6,
      f
    );
  }
  f = message.getActivePrecompilesList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      7,
      f
    );
  }
};


/**
 * optional string evm_denom = 1;
 * @return {string}
 */
proto.ethermint.evm.v1.Params.prototype.getEvmDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.ethermint.evm.v1.Params} returns this
 */
proto.ethermint.evm.v1.Params.prototype.setEvmDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional bool enable_create = 2;
 * @return {boolean}
 */
proto.ethermint.evm.v1.Params.prototype.getEnableCreate = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 2, false));
};


/**
 * @param {boolean} value
 * @return {!proto.ethermint.evm.v1.Params} returns this
 */
proto.ethermint.evm.v1.Params.prototype.setEnableCreate = function(value) {
  return jspb.Message.setProto3BooleanField(this, 2, value);
};


/**
 * optional bool enable_call = 3;
 * @return {boolean}
 */
proto.ethermint.evm.v1.Params.prototype.getEnableCall = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 3, false));
};


/**
 * @param {boolean} value
 * @return {!proto.ethermint.evm.v1.Params} returns this
 */
proto.ethermint.evm.v1.Params.prototype.setEnableCall = function(value) {
  return jspb.Message.setProto3BooleanField(this, 3, value);
};


/**
 * repeated int64 extra_eips = 4;
 * @return {!Array<number>}
 */
proto.ethermint.evm.v1.Params.prototype.getExtraEipsList = function() {
  return /** @type {!Array<number>} */ (jspb.Message.getRepeatedField(this, 4));
};


/**
 * @param {!Array<number>} value
 * @return {!proto.ethermint.evm.v1.Params} returns this
 */
proto.ethermint.evm.v1.Params.prototype.setExtraEipsList = function(value) {
  return jspb.Message.setField(this, 4, value || []);
};


/**
 * @param {number} value
 * @param {number=} opt_index
 * @return {!proto.ethermint.evm.v1.Params} returns this
 */
proto.ethermint.evm.v1.Params.prototype.addExtraEips = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 4, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.ethermint.evm.v1.Params} returns this
 */
proto.ethermint.evm.v1.Params.prototype.clearExtraEipsList = function() {
  return this.setExtraEipsList([]);
};


/**
 * optional ChainConfig chain_config = 5;
 * @return {?proto.ethermint.evm.v1.ChainConfig}
 */
proto.ethermint.evm.v1.Params.prototype.getChainConfig = function() {
  return /** @type{?proto.ethermint.evm.v1.ChainConfig} */ (
    jspb.Message.getWrapperField(this, proto.ethermint.evm.v1.ChainConfig, 5));
};


/**
 * @param {?proto.ethermint.evm.v1.ChainConfig|undefined} value
 * @return {!proto.ethermint.evm.v1.Params} returns this
*/
proto.ethermint.evm.v1.Params.prototype.setChainConfig = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ethermint.evm.v1.Params} returns this
 */
proto.ethermint.evm.v1.Params.prototype.clearChainConfig = function() {
  return this.setChainConfig(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ethermint.evm.v1.Params.prototype.hasChainConfig = function() {
  return jspb.Message.getField(this, 5) != null;
};


/**
 * optional bool allow_unprotected_txs = 6;
 * @return {boolean}
 */
proto.ethermint.evm.v1.Params.prototype.getAllowUnprotectedTxs = function() {
  return /** @type {boolean} */ (jspb.Message.getBooleanFieldWithDefault(this, 6, false));
};


/**
 * @param {boolean} value
 * @return {!proto.ethermint.evm.v1.Params} returns this
 */
proto.ethermint.evm.v1.Params.prototype.setAllowUnprotectedTxs = function(value) {
  return jspb.Message.setProto3BooleanField(this, 6, value);
};


/**
 * repeated string active_precompiles = 7;
 * @return {!Array<string>}
 */
proto.ethermint.evm.v1.Params.prototype.getActivePrecompilesList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 7));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.ethermint.evm.v1.Params} returns this
 */
proto.ethermint.evm.v1.Params.prototype.setActivePrecompilesList = function(value) {
  return jspb.Message.setField(this, 7, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.ethermint.evm.v1.Params} returns this
 */
proto.ethermint.evm.v1.Params.prototype.addActivePrecompiles = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 7, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.ethermint.evm.v1.Params} returns this
 */
proto.ethermint.evm.v1.Params.prototype.clearActivePrecompilesList = function() {
  return this.setActivePrecompilesList([]);
};


