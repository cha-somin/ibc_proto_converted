// source: kyve/stakers/v1beta1/stakers.proto
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

goog.provide('proto.kyve.stakers.v1beta1.LeavePoolEntry');

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
proto.kyve.stakers.v1beta1.LeavePoolEntry = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.kyve.stakers.v1beta1.LeavePoolEntry, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kyve.stakers.v1beta1.LeavePoolEntry.displayName = 'proto.kyve.stakers.v1beta1.LeavePoolEntry';
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
proto.kyve.stakers.v1beta1.LeavePoolEntry.prototype.toObject = function(opt_includeInstance) {
  return proto.kyve.stakers.v1beta1.LeavePoolEntry.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kyve.stakers.v1beta1.LeavePoolEntry} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.stakers.v1beta1.LeavePoolEntry.toObject = function(includeInstance, msg) {
  var f, obj = {
    index: jspb.Message.getFieldWithDefault(msg, 1, 0),
    staker: jspb.Message.getFieldWithDefault(msg, 2, ""),
    poolId: jspb.Message.getFieldWithDefault(msg, 3, 0),
    creationDate: jspb.Message.getFieldWithDefault(msg, 4, 0)
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
 * @return {!proto.kyve.stakers.v1beta1.LeavePoolEntry}
 */
proto.kyve.stakers.v1beta1.LeavePoolEntry.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kyve.stakers.v1beta1.LeavePoolEntry;
  return proto.kyve.stakers.v1beta1.LeavePoolEntry.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kyve.stakers.v1beta1.LeavePoolEntry} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kyve.stakers.v1beta1.LeavePoolEntry}
 */
proto.kyve.stakers.v1beta1.LeavePoolEntry.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setIndex(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setStaker(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setPoolId(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setCreationDate(value);
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
proto.kyve.stakers.v1beta1.LeavePoolEntry.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kyve.stakers.v1beta1.LeavePoolEntry.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kyve.stakers.v1beta1.LeavePoolEntry} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.stakers.v1beta1.LeavePoolEntry.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getIndex();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getStaker();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getPoolId();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getCreationDate();
  if (f !== 0) {
    writer.writeInt64(
      4,
      f
    );
  }
};


/**
 * optional uint64 index = 1;
 * @return {number}
 */
proto.kyve.stakers.v1beta1.LeavePoolEntry.prototype.getIndex = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.stakers.v1beta1.LeavePoolEntry} returns this
 */
proto.kyve.stakers.v1beta1.LeavePoolEntry.prototype.setIndex = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string staker = 2;
 * @return {string}
 */
proto.kyve.stakers.v1beta1.LeavePoolEntry.prototype.getStaker = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.kyve.stakers.v1beta1.LeavePoolEntry} returns this
 */
proto.kyve.stakers.v1beta1.LeavePoolEntry.prototype.setStaker = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional uint64 pool_id = 3;
 * @return {number}
 */
proto.kyve.stakers.v1beta1.LeavePoolEntry.prototype.getPoolId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.stakers.v1beta1.LeavePoolEntry} returns this
 */
proto.kyve.stakers.v1beta1.LeavePoolEntry.prototype.setPoolId = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional int64 creation_date = 4;
 * @return {number}
 */
proto.kyve.stakers.v1beta1.LeavePoolEntry.prototype.getCreationDate = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.stakers.v1beta1.LeavePoolEntry} returns this
 */
proto.kyve.stakers.v1beta1.LeavePoolEntry.prototype.setCreationDate = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


