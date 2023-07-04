// source: axelar/tss/v1beta1/params.proto
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

goog.provide('proto.axelar.tss.v1beta1.Params');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.axelar.tss.exported.v1beta1.KeyRequirement');
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
proto.axelar.tss.v1beta1.Params = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.axelar.tss.v1beta1.Params.repeatedFields_, null);
};
goog.inherits(proto.axelar.tss.v1beta1.Params, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.axelar.tss.v1beta1.Params.displayName = 'proto.axelar.tss.v1beta1.Params';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.axelar.tss.v1beta1.Params.repeatedFields_ = [1];



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
proto.axelar.tss.v1beta1.Params.prototype.toObject = function(opt_includeInstance) {
  return proto.axelar.tss.v1beta1.Params.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.axelar.tss.v1beta1.Params} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.tss.v1beta1.Params.toObject = function(includeInstance, msg) {
  var f, obj = {
    keyRequirementsList: jspb.Message.toObjectList(msg.getKeyRequirementsList(),
    proto.axelar.tss.exported.v1beta1.KeyRequirement.toObject, includeInstance),
    suspendDurationInBlocks: jspb.Message.getFieldWithDefault(msg, 2, 0),
    heartbeatPeriodInBlocks: jspb.Message.getFieldWithDefault(msg, 3, 0),
    maxMissedBlocksPerWindow: (f = msg.getMaxMissedBlocksPerWindow()) && proto.axelar.utils.v1beta1.Threshold.toObject(includeInstance, f),
    unbondingLockingKeyRotationCount: jspb.Message.getFieldWithDefault(msg, 5, 0),
    externalMultisigThreshold: (f = msg.getExternalMultisigThreshold()) && proto.axelar.utils.v1beta1.Threshold.toObject(includeInstance, f),
    maxSignQueueSize: jspb.Message.getFieldWithDefault(msg, 7, 0),
    maxSimultaneousSignShares: jspb.Message.getFieldWithDefault(msg, 8, 0),
    tssSignedBlocksWindow: jspb.Message.getFieldWithDefault(msg, 9, 0)
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
 * @return {!proto.axelar.tss.v1beta1.Params}
 */
proto.axelar.tss.v1beta1.Params.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.axelar.tss.v1beta1.Params;
  return proto.axelar.tss.v1beta1.Params.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.axelar.tss.v1beta1.Params} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.axelar.tss.v1beta1.Params}
 */
proto.axelar.tss.v1beta1.Params.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.axelar.tss.exported.v1beta1.KeyRequirement;
      reader.readMessage(value,proto.axelar.tss.exported.v1beta1.KeyRequirement.deserializeBinaryFromReader);
      msg.addKeyRequirements(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setSuspendDurationInBlocks(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setHeartbeatPeriodInBlocks(value);
      break;
    case 4:
      var value = new proto.axelar.utils.v1beta1.Threshold;
      reader.readMessage(value,proto.axelar.utils.v1beta1.Threshold.deserializeBinaryFromReader);
      msg.setMaxMissedBlocksPerWindow(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setUnbondingLockingKeyRotationCount(value);
      break;
    case 6:
      var value = new proto.axelar.utils.v1beta1.Threshold;
      reader.readMessage(value,proto.axelar.utils.v1beta1.Threshold.deserializeBinaryFromReader);
      msg.setExternalMultisigThreshold(value);
      break;
    case 7:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setMaxSignQueueSize(value);
      break;
    case 8:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setMaxSimultaneousSignShares(value);
      break;
    case 9:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setTssSignedBlocksWindow(value);
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
proto.axelar.tss.v1beta1.Params.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.axelar.tss.v1beta1.Params.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.axelar.tss.v1beta1.Params} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.axelar.tss.v1beta1.Params.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getKeyRequirementsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.axelar.tss.exported.v1beta1.KeyRequirement.serializeBinaryToWriter
    );
  }
  f = message.getSuspendDurationInBlocks();
  if (f !== 0) {
    writer.writeInt64(
      2,
      f
    );
  }
  f = message.getHeartbeatPeriodInBlocks();
  if (f !== 0) {
    writer.writeInt64(
      3,
      f
    );
  }
  f = message.getMaxMissedBlocksPerWindow();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.axelar.utils.v1beta1.Threshold.serializeBinaryToWriter
    );
  }
  f = message.getUnbondingLockingKeyRotationCount();
  if (f !== 0) {
    writer.writeInt64(
      5,
      f
    );
  }
  f = message.getExternalMultisigThreshold();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.axelar.utils.v1beta1.Threshold.serializeBinaryToWriter
    );
  }
  f = message.getMaxSignQueueSize();
  if (f !== 0) {
    writer.writeInt64(
      7,
      f
    );
  }
  f = message.getMaxSimultaneousSignShares();
  if (f !== 0) {
    writer.writeInt64(
      8,
      f
    );
  }
  f = message.getTssSignedBlocksWindow();
  if (f !== 0) {
    writer.writeInt64(
      9,
      f
    );
  }
};


/**
 * repeated axelar.tss.exported.v1beta1.KeyRequirement key_requirements = 1;
 * @return {!Array<!proto.axelar.tss.exported.v1beta1.KeyRequirement>}
 */
proto.axelar.tss.v1beta1.Params.prototype.getKeyRequirementsList = function() {
  return /** @type{!Array<!proto.axelar.tss.exported.v1beta1.KeyRequirement>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.axelar.tss.exported.v1beta1.KeyRequirement, 1));
};


/**
 * @param {!Array<!proto.axelar.tss.exported.v1beta1.KeyRequirement>} value
 * @return {!proto.axelar.tss.v1beta1.Params} returns this
*/
proto.axelar.tss.v1beta1.Params.prototype.setKeyRequirementsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.axelar.tss.exported.v1beta1.KeyRequirement=} opt_value
 * @param {number=} opt_index
 * @return {!proto.axelar.tss.exported.v1beta1.KeyRequirement}
 */
proto.axelar.tss.v1beta1.Params.prototype.addKeyRequirements = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.axelar.tss.exported.v1beta1.KeyRequirement, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.axelar.tss.v1beta1.Params} returns this
 */
proto.axelar.tss.v1beta1.Params.prototype.clearKeyRequirementsList = function() {
  return this.setKeyRequirementsList([]);
};


/**
 * optional int64 suspend_duration_in_blocks = 2;
 * @return {number}
 */
proto.axelar.tss.v1beta1.Params.prototype.getSuspendDurationInBlocks = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.axelar.tss.v1beta1.Params} returns this
 */
proto.axelar.tss.v1beta1.Params.prototype.setSuspendDurationInBlocks = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional int64 heartbeat_period_in_blocks = 3;
 * @return {number}
 */
proto.axelar.tss.v1beta1.Params.prototype.getHeartbeatPeriodInBlocks = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.axelar.tss.v1beta1.Params} returns this
 */
proto.axelar.tss.v1beta1.Params.prototype.setHeartbeatPeriodInBlocks = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional axelar.utils.v1beta1.Threshold max_missed_blocks_per_window = 4;
 * @return {?proto.axelar.utils.v1beta1.Threshold}
 */
proto.axelar.tss.v1beta1.Params.prototype.getMaxMissedBlocksPerWindow = function() {
  return /** @type{?proto.axelar.utils.v1beta1.Threshold} */ (
    jspb.Message.getWrapperField(this, proto.axelar.utils.v1beta1.Threshold, 4));
};


/**
 * @param {?proto.axelar.utils.v1beta1.Threshold|undefined} value
 * @return {!proto.axelar.tss.v1beta1.Params} returns this
*/
proto.axelar.tss.v1beta1.Params.prototype.setMaxMissedBlocksPerWindow = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.tss.v1beta1.Params} returns this
 */
proto.axelar.tss.v1beta1.Params.prototype.clearMaxMissedBlocksPerWindow = function() {
  return this.setMaxMissedBlocksPerWindow(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.tss.v1beta1.Params.prototype.hasMaxMissedBlocksPerWindow = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional int64 unbonding_locking_key_rotation_count = 5;
 * @return {number}
 */
proto.axelar.tss.v1beta1.Params.prototype.getUnbondingLockingKeyRotationCount = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.axelar.tss.v1beta1.Params} returns this
 */
proto.axelar.tss.v1beta1.Params.prototype.setUnbondingLockingKeyRotationCount = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * optional axelar.utils.v1beta1.Threshold external_multisig_threshold = 6;
 * @return {?proto.axelar.utils.v1beta1.Threshold}
 */
proto.axelar.tss.v1beta1.Params.prototype.getExternalMultisigThreshold = function() {
  return /** @type{?proto.axelar.utils.v1beta1.Threshold} */ (
    jspb.Message.getWrapperField(this, proto.axelar.utils.v1beta1.Threshold, 6));
};


/**
 * @param {?proto.axelar.utils.v1beta1.Threshold|undefined} value
 * @return {!proto.axelar.tss.v1beta1.Params} returns this
*/
proto.axelar.tss.v1beta1.Params.prototype.setExternalMultisigThreshold = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.axelar.tss.v1beta1.Params} returns this
 */
proto.axelar.tss.v1beta1.Params.prototype.clearExternalMultisigThreshold = function() {
  return this.setExternalMultisigThreshold(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.axelar.tss.v1beta1.Params.prototype.hasExternalMultisigThreshold = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * optional int64 max_sign_queue_size = 7;
 * @return {number}
 */
proto.axelar.tss.v1beta1.Params.prototype.getMaxSignQueueSize = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 7, 0));
};


/**
 * @param {number} value
 * @return {!proto.axelar.tss.v1beta1.Params} returns this
 */
proto.axelar.tss.v1beta1.Params.prototype.setMaxSignQueueSize = function(value) {
  return jspb.Message.setProto3IntField(this, 7, value);
};


/**
 * optional int64 max_simultaneous_sign_shares = 8;
 * @return {number}
 */
proto.axelar.tss.v1beta1.Params.prototype.getMaxSimultaneousSignShares = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 8, 0));
};


/**
 * @param {number} value
 * @return {!proto.axelar.tss.v1beta1.Params} returns this
 */
proto.axelar.tss.v1beta1.Params.prototype.setMaxSimultaneousSignShares = function(value) {
  return jspb.Message.setProto3IntField(this, 8, value);
};


/**
 * optional int64 tss_signed_blocks_window = 9;
 * @return {number}
 */
proto.axelar.tss.v1beta1.Params.prototype.getTssSignedBlocksWindow = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 9, 0));
};


/**
 * @param {number} value
 * @return {!proto.axelar.tss.v1beta1.Params} returns this
 */
proto.axelar.tss.v1beta1.Params.prototype.setTssSignedBlocksWindow = function(value) {
  return jspb.Message.setProto3IntField(this, 9, value);
};

