// source: kyve/pool/v1beta1/tx.proto
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

goog.provide('proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade');

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
proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade.displayName = 'proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade';
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
proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade.prototype.toObject = function(opt_includeInstance) {
  return proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade.toObject = function(includeInstance, msg) {
  var f, obj = {
    authority: jspb.Message.getFieldWithDefault(msg, 1, ""),
    runtime: jspb.Message.getFieldWithDefault(msg, 2, ""),
    version: jspb.Message.getFieldWithDefault(msg, 3, ""),
    scheduledAt: jspb.Message.getFieldWithDefault(msg, 4, 0),
    duration: jspb.Message.getFieldWithDefault(msg, 5, 0),
    binaries: jspb.Message.getFieldWithDefault(msg, 6, "")
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
 * @return {!proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade}
 */
proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade;
  return proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade}
 */
proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setAuthority(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setRuntime(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setVersion(value);
      break;
    case 4:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setScheduledAt(value);
      break;
    case 5:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setDuration(value);
      break;
    case 6:
      var value = /** @type {string} */ (reader.readString());
      msg.setBinaries(value);
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
proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAuthority();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getRuntime();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getVersion();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getScheduledAt();
  if (f !== 0) {
    writer.writeUint64(
      4,
      f
    );
  }
  f = message.getDuration();
  if (f !== 0) {
    writer.writeUint64(
      5,
      f
    );
  }
  f = message.getBinaries();
  if (f.length > 0) {
    writer.writeString(
      6,
      f
    );
  }
};


/**
 * optional string authority = 1;
 * @return {string}
 */
proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade.prototype.getAuthority = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade} returns this
 */
proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade.prototype.setAuthority = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string runtime = 2;
 * @return {string}
 */
proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade.prototype.getRuntime = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade} returns this
 */
proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade.prototype.setRuntime = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string version = 3;
 * @return {string}
 */
proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade.prototype.getVersion = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade} returns this
 */
proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade.prototype.setVersion = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional uint64 scheduled_at = 4;
 * @return {number}
 */
proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade.prototype.getScheduledAt = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 4, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade} returns this
 */
proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade.prototype.setScheduledAt = function(value) {
  return jspb.Message.setProto3IntField(this, 4, value);
};


/**
 * optional uint64 duration = 5;
 * @return {number}
 */
proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade.prototype.getDuration = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 5, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade} returns this
 */
proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade.prototype.setDuration = function(value) {
  return jspb.Message.setProto3IntField(this, 5, value);
};


/**
 * optional string binaries = 6;
 * @return {string}
 */
proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade.prototype.getBinaries = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 6, ""));
};


/**
 * @param {string} value
 * @return {!proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade} returns this
 */
proto.kyve.pool.v1beta1.MsgScheduleRuntimeUpgrade.prototype.setBinaries = function(value) {
  return jspb.Message.setProto3StringField(this, 6, value);
};

