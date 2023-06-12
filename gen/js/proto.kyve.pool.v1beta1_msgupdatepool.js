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

goog.provide('proto.kyve.pool.v1beta1.MsgUpdatePool');

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
proto.kyve.pool.v1beta1.MsgUpdatePool = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.kyve.pool.v1beta1.MsgUpdatePool, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.kyve.pool.v1beta1.MsgUpdatePool.displayName = 'proto.kyve.pool.v1beta1.MsgUpdatePool';
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
proto.kyve.pool.v1beta1.MsgUpdatePool.prototype.toObject = function(opt_includeInstance) {
  return proto.kyve.pool.v1beta1.MsgUpdatePool.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.kyve.pool.v1beta1.MsgUpdatePool} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.pool.v1beta1.MsgUpdatePool.toObject = function(includeInstance, msg) {
  var f, obj = {
    authority: jspb.Message.getFieldWithDefault(msg, 1, ""),
    id: jspb.Message.getFieldWithDefault(msg, 2, 0),
    payload: jspb.Message.getFieldWithDefault(msg, 3, "")
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
 * @return {!proto.kyve.pool.v1beta1.MsgUpdatePool}
 */
proto.kyve.pool.v1beta1.MsgUpdatePool.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.kyve.pool.v1beta1.MsgUpdatePool;
  return proto.kyve.pool.v1beta1.MsgUpdatePool.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.kyve.pool.v1beta1.MsgUpdatePool} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.kyve.pool.v1beta1.MsgUpdatePool}
 */
proto.kyve.pool.v1beta1.MsgUpdatePool.deserializeBinaryFromReader = function(msg, reader) {
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
      var value = /** @type {number} */ (reader.readUint64());
      msg.setId(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setPayload(value);
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
proto.kyve.pool.v1beta1.MsgUpdatePool.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.kyve.pool.v1beta1.MsgUpdatePool.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.kyve.pool.v1beta1.MsgUpdatePool} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.kyve.pool.v1beta1.MsgUpdatePool.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAuthority();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getId();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getPayload();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
};


/**
 * optional string authority = 1;
 * @return {string}
 */
proto.kyve.pool.v1beta1.MsgUpdatePool.prototype.getAuthority = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.kyve.pool.v1beta1.MsgUpdatePool} returns this
 */
proto.kyve.pool.v1beta1.MsgUpdatePool.prototype.setAuthority = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional uint64 id = 2;
 * @return {number}
 */
proto.kyve.pool.v1beta1.MsgUpdatePool.prototype.getId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.kyve.pool.v1beta1.MsgUpdatePool} returns this
 */
proto.kyve.pool.v1beta1.MsgUpdatePool.prototype.setId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional string payload = 3;
 * @return {string}
 */
proto.kyve.pool.v1beta1.MsgUpdatePool.prototype.getPayload = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.kyve.pool.v1beta1.MsgUpdatePool} returns this
 */
proto.kyve.pool.v1beta1.MsgUpdatePool.prototype.setPayload = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


