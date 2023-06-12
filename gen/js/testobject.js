// source: iov/escrow/v1beta1/test.proto
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

goog.provide('proto.starnamed.x.escrow.v1beta1.TestObject');

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
proto.starnamed.x.escrow.v1beta1.TestObject = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.starnamed.x.escrow.v1beta1.TestObject, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.starnamed.x.escrow.v1beta1.TestObject.displayName = 'proto.starnamed.x.escrow.v1beta1.TestObject';
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
proto.starnamed.x.escrow.v1beta1.TestObject.prototype.toObject = function(opt_includeInstance) {
  return proto.starnamed.x.escrow.v1beta1.TestObject.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.starnamed.x.escrow.v1beta1.TestObject} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.starnamed.x.escrow.v1beta1.TestObject.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, 0),
    owner: msg.getOwner_asB64(),
    numAllowedTransfers: jspb.Message.getFieldWithDefault(msg, 3, 0)
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
 * @return {!proto.starnamed.x.escrow.v1beta1.TestObject}
 */
proto.starnamed.x.escrow.v1beta1.TestObject.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.starnamed.x.escrow.v1beta1.TestObject;
  return proto.starnamed.x.escrow.v1beta1.TestObject.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.starnamed.x.escrow.v1beta1.TestObject} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.starnamed.x.escrow.v1beta1.TestObject}
 */
proto.starnamed.x.escrow.v1beta1.TestObject.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setId(value);
      break;
    case 2:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setOwner(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setNumAllowedTransfers(value);
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
proto.starnamed.x.escrow.v1beta1.TestObject.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.starnamed.x.escrow.v1beta1.TestObject.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.starnamed.x.escrow.v1beta1.TestObject} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.starnamed.x.escrow.v1beta1.TestObject.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getOwner_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      2,
      f
    );
  }
  f = message.getNumAllowedTransfers();
  if (f !== 0) {
    writer.writeInt64(
      3,
      f
    );
  }
};


/**
 * optional uint64 id = 1;
 * @return {number}
 */
proto.starnamed.x.escrow.v1beta1.TestObject.prototype.getId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.starnamed.x.escrow.v1beta1.TestObject} returns this
 */
proto.starnamed.x.escrow.v1beta1.TestObject.prototype.setId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional bytes owner = 2;
 * @return {string}
 */
proto.starnamed.x.escrow.v1beta1.TestObject.prototype.getOwner = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * optional bytes owner = 2;
 * This is a type-conversion wrapper around `getOwner()`
 * @return {string}
 */
proto.starnamed.x.escrow.v1beta1.TestObject.prototype.getOwner_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getOwner()));
};


/**
 * optional bytes owner = 2;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getOwner()`
 * @return {!Uint8Array}
 */
proto.starnamed.x.escrow.v1beta1.TestObject.prototype.getOwner_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getOwner()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.starnamed.x.escrow.v1beta1.TestObject} returns this
 */
proto.starnamed.x.escrow.v1beta1.TestObject.prototype.setOwner = function(value) {
  return jspb.Message.setProto3BytesField(this, 2, value);
};


/**
 * optional int64 num_allowed_transfers = 3;
 * @return {number}
 */
proto.starnamed.x.escrow.v1beta1.TestObject.prototype.getNumAllowedTransfers = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.starnamed.x.escrow.v1beta1.TestObject} returns this
 */
proto.starnamed.x.escrow.v1beta1.TestObject.prototype.setNumAllowedTransfers = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


