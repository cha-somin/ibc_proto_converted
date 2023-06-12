// source: osmosis/pool-incentives/v1beta1/incentives.proto
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

goog.provide('proto.osmosis.poolincentives.v1beta1.LockableDurationsInfo');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Duration');

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
proto.osmosis.poolincentives.v1beta1.LockableDurationsInfo = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.osmosis.poolincentives.v1beta1.LockableDurationsInfo.repeatedFields_, null);
};
goog.inherits(proto.osmosis.poolincentives.v1beta1.LockableDurationsInfo, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.osmosis.poolincentives.v1beta1.LockableDurationsInfo.displayName = 'proto.osmosis.poolincentives.v1beta1.LockableDurationsInfo';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.osmosis.poolincentives.v1beta1.LockableDurationsInfo.repeatedFields_ = [1];



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
proto.osmosis.poolincentives.v1beta1.LockableDurationsInfo.prototype.toObject = function(opt_includeInstance) {
  return proto.osmosis.poolincentives.v1beta1.LockableDurationsInfo.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.osmosis.poolincentives.v1beta1.LockableDurationsInfo} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.poolincentives.v1beta1.LockableDurationsInfo.toObject = function(includeInstance, msg) {
  var f, obj = {
    lockableDurationsList: jspb.Message.toObjectList(msg.getLockableDurationsList(),
    proto.google.protobuf.Duration.toObject, includeInstance)
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
 * @return {!proto.osmosis.poolincentives.v1beta1.LockableDurationsInfo}
 */
proto.osmosis.poolincentives.v1beta1.LockableDurationsInfo.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.osmosis.poolincentives.v1beta1.LockableDurationsInfo;
  return proto.osmosis.poolincentives.v1beta1.LockableDurationsInfo.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.osmosis.poolincentives.v1beta1.LockableDurationsInfo} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.osmosis.poolincentives.v1beta1.LockableDurationsInfo}
 */
proto.osmosis.poolincentives.v1beta1.LockableDurationsInfo.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.google.protobuf.Duration;
      reader.readMessage(value,proto.google.protobuf.Duration.deserializeBinaryFromReader);
      msg.addLockableDurations(value);
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
proto.osmosis.poolincentives.v1beta1.LockableDurationsInfo.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.osmosis.poolincentives.v1beta1.LockableDurationsInfo.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.osmosis.poolincentives.v1beta1.LockableDurationsInfo} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.poolincentives.v1beta1.LockableDurationsInfo.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getLockableDurationsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.google.protobuf.Duration.serializeBinaryToWriter
    );
  }
};


/**
 * repeated google.protobuf.Duration lockable_durations = 1;
 * @return {!Array<!proto.google.protobuf.Duration>}
 */
proto.osmosis.poolincentives.v1beta1.LockableDurationsInfo.prototype.getLockableDurationsList = function() {
  return /** @type{!Array<!proto.google.protobuf.Duration>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.google.protobuf.Duration, 1));
};


/**
 * @param {!Array<!proto.google.protobuf.Duration>} value
 * @return {!proto.osmosis.poolincentives.v1beta1.LockableDurationsInfo} returns this
*/
proto.osmosis.poolincentives.v1beta1.LockableDurationsInfo.prototype.setLockableDurationsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.google.protobuf.Duration=} opt_value
 * @param {number=} opt_index
 * @return {!proto.google.protobuf.Duration}
 */
proto.osmosis.poolincentives.v1beta1.LockableDurationsInfo.prototype.addLockableDurations = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.google.protobuf.Duration, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.osmosis.poolincentives.v1beta1.LockableDurationsInfo} returns this
 */
proto.osmosis.poolincentives.v1beta1.LockableDurationsInfo.prototype.clearLockableDurationsList = function() {
  return this.setLockableDurationsList([]);
};


