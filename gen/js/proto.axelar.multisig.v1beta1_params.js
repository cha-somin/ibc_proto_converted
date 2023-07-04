// source: axelar/multisig/v1beta1/params.proto
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

goog.provide('proto.axelar.multisig.v1beta1.Params');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.axelar.utils.v1beta1.Threshold');

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
proto.axelar.multisig.v1beta1.Params = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.axelar.multisig.v1beta1.Params, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.multisig.v1beta1.Params.displayName = 'proto.axelar.multisig.v1beta1.Params';
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
proto.axelar.multisig.v1beta1.Params.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.multisig.v1beta1.Params.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.multisig.v1beta1.Params} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.multisig.v1beta1.Params.toObject = function(includeInstance, msg) {
  var f, obj = {
    keygenThreshold: (f = msg.getKeygenThreshold()) && proto.axelar.utils.v1beta1.Threshold.toObject(includeInstance, f),
    signingThreshold: (f = msg.getSigningThreshold()) && proto.axelar.utils.v1beta1.Threshold.toObject(includeInstance, f),
    keygenTimeout: jspb.Message.getFieldWithDefault(msg, 3, 0),
    keygenGracePeriod: jspb.Message.getFieldWithDefault(msg, 4, 0),
    signingTimeout: jspb.Message.getFieldWithDefault(msg, 5, 0),
    signingGracePeriod: jspb.Message.getFieldWithDefault(msg, 6, 0),
    activeEpochCount: jspb.Message.getFieldWithDefault(msg, 7, 0)
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
 * @return {!proto.axelar.multisig.v1beta1.Params}
 */
proto.axelar.multisig.v1beta1.Params.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.multisig.v1beta1.Params;
  return proto.axelar.multisig.v1beta1.Params.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.multisig.v1beta1.Params} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.multisig.v1beta1.Params}
 */
proto.axelar.multisig.v1beta1.Params.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.axelar.utils.v1beta1.Threshold;
      reader.readMessage(value,proto.axelar.utils.v1beta1.Threshold.deserializeBinaryFromReader);
      msg.setKeygenThreshold(value);
      break;
    case 2:
      var value = new proto.axelar.utils.v1beta1.Threshold;
      reader.readMessage(value,proto.axelar.utils.v1beta1.Threshold.deserializeBinaryFromReader);
      msg.setSigningThreshold(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setKeygenTimeout(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setKeygenGracePeriod(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setSigningTimeout(value);
      break;
    case 6:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setSigningGracePeriod(value);
      break;
    case 7:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setActiveEpochCount(value);
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
proto.axelar.multisig.v1beta1.Params.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.multisig.v1beta1.Params.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.multisig.v1beta1.Params} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.multisig.v1beta1.Params.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getKeygenThreshold();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.axelar.utils.v1beta1.Threshold.serializeBinaryToWriter
    );
  }
  f = message.getSigningThreshold();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.axelar.utils.v1beta1.Threshold.serializeBinaryToWriter
    );
  }
  f = message.getKeygenTimeout();
  if (f !== 0) {
    writer.writeInt64(
      3,
      f
    );
  }
  f = message.getKeygenGracePeriod();
  if (f !== 0) {
    writer.writeInt64(
      4,
      f
    );
  }
  f = message.getSigningTimeout();
  if (f !== 0) {
    writer.writeInt64(
      5,
      f
    );
  }
  f = message.getSigningGracePeriod();
  if (f !== 0) {
    writer.writeInt64(
      6,
      f
    );
  }
  f = message.getActiveEpochCount();
  if (f !== 0) {
    writer.writeUint64(
      7,
      f
    );
  }
};


/**
 * optional axelar.utils.v1beta1.Threshold keygen_threshold = 1;
 * @return {?proto.axelar.utils.v1beta1.Threshold}
 */
proto.axelar.multisig.v1beta1.Params.prototype.getKeygenThreshold = function() {
  return /** @type{?proto.axelar.utils.v1beta1.Threshold} */ (
    jspb.Message.getWrapperField(this, proto.axelar.utils.v1beta1.Threshold, 1));
};


/**
 * @param {?proto.axelar.utils.v1beta1.Threshold|undefined} value
 * @return {!proto.axelar.multisig.v1beta1.Params} returns this
*/
proto.axelar.multisig.v1beta1.Params.prototype.setKeygenThreshold = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.multisig.v1beta1.Params} returns this
 */
proto.axelar.multisig.v1beta1.Params.prototype.clearKeygenThreshold = function() {
  return this.setKeygenThreshold(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.multisig.v1beta1.Params.prototype.hasKeygenThreshold = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional axelar.utils.v1beta1.Threshold signing_threshold = 2;
 * @return {?proto.axelar.utils.v1beta1.Threshold}
 */
proto.axelar.multisig.v1beta1.Params.prototype.getSigningThreshold = function() {
  return /** @type{?proto.axelar.utils.v1beta1.Threshold} */ (
    jspb.Message.getWrapperField(this, proto.axelar.utils.v1beta1.Threshold, 2));
};


/**
 * @param {?proto.axelar.utils.v1beta1.Threshold|undefined} value
 * @return {!proto.axelar.multisig.v1beta1.Params} returns this
*/
proto.axelar.multisig.v1beta1.Params.prototype.setSigningThreshold = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.multisig.v1beta1.Params} returns this
 */
proto.axelar.multisig.v1beta1.Params.prototype.clearSigningThreshold = function() {
  return this.setSigningThreshold(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.multisig.v1beta1.Params.prototype.hasSigningThreshold = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional int64 keygen_timeout = 3;
 * @return {number}
 */
proto.axelar.multisig.v1beta1.Params.prototype.getKeygenTimeout = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.axelar.multisig.v1beta1.Params} returns this
 */
proto.axelar.multisig.v1beta1.Params.prototype.setKeygenTimeout = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional int64 keygen_grace_period = 4;
 * @return {number}
 */
proto.axelar.multisig.v1beta1.Params.prototype.getKeygenGracePeriod = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.axelar.multisig.v1beta1.Params} returns this
 */
proto.axelar.multisig.v1beta1.Params.prototype.setKeygenGracePeriod = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional int64 signing_timeout = 5;
 * @return {number}
 */
proto.axelar.multisig.v1beta1.Params.prototype.getSigningTimeout = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.axelar.multisig.v1beta1.Params} returns this
 */
proto.axelar.multisig.v1beta1.Params.prototype.setSigningTimeout = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * optional int64 signing_grace_period = 6;
 * @return {number}
 */
proto.axelar.multisig.v1beta1.Params.prototype.getSigningGracePeriod = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 6, 0));
};


/**
 * @param {number} value
 * @return {!proto.axelar.multisig.v1beta1.Params} returns this
 */
proto.axelar.multisig.v1beta1.Params.prototype.setSigningGracePeriod = function(value) {
  return jspb.Message.setProto3IntField(this, 6, value);
};


/**
 * optional uint64 active_epoch_count = 7;
 * @return {number}
 */
proto.axelar.multisig.v1beta1.Params.prototype.getActiveEpochCount = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 7, 0));
};


/**
 * @param {number} value
 * @return {!proto.axelar.multisig.v1beta1.Params} returns this
 */
proto.axelar.multisig.v1beta1.Params.prototype.setActiveEpochCount = function(value) {
  return jspb.Message.setProto3IntField(this, 7, value);
};

