// source: osmosis/protorev/v1beta1/tx.proto
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

goog.provide('proto.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock');

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
proto.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock.displayName = 'proto.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock';
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
proto.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock.prototype.toObject = function(opt_includeInstance) {
  return proto.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock.toObject = function(includeInstance, msg) {
  var f, obj = {
    admin: jspb.Message.getFieldWithDefault(msg, 1, ""),
    maxPoolPointsPerBlock: jspb.Message.getFieldWithDefault(msg, 2, 0)
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
 * @return {!proto.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock}
 */
proto.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock;
  return proto.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock}
 */
proto.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setAdmin(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setMaxPoolPointsPerBlock(value);
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
proto.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAdmin();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getMaxPoolPointsPerBlock();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
};


/**
 * optional string admin = 1;
 * @return {string}
 */
proto.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock.prototype.getAdmin = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock} returns this
 */
proto.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock.prototype.setAdmin = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional uint64 max_pool_points_per_block = 2;
 * @return {number}
 */
proto.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock.prototype.getMaxPoolPointsPerBlock = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock} returns this
 */
proto.osmosis.protorev.v1beta1.MsgSetMaxPoolPointsPerBlock.prototype.setMaxPoolPointsPerBlock = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


