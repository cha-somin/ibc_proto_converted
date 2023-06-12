// source: secret/compute/v1beta1/query.proto
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

goog.provide('proto.secret.compute.v1beta1.CodeInfoResponse');

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
proto.secret.compute.v1beta1.CodeInfoResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.secret.compute.v1beta1.CodeInfoResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.secret.compute.v1beta1.CodeInfoResponse.displayName = 'proto.secret.compute.v1beta1.CodeInfoResponse';
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
proto.secret.compute.v1beta1.CodeInfoResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.secret.compute.v1beta1.CodeInfoResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.secret.compute.v1beta1.CodeInfoResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.secret.compute.v1beta1.CodeInfoResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    codeId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    creator: jspb.Message.getFieldWithDefault(msg, 2, ""),
    codeHash: jspb.Message.getFieldWithDefault(msg, 3, ""),
    source: jspb.Message.getFieldWithDefault(msg, 4, ""),
    builder: jspb.Message.getFieldWithDefault(msg, 5, "")
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
 * @return {!proto.secret.compute.v1beta1.CodeInfoResponse}
 */
proto.secret.compute.v1beta1.CodeInfoResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.secret.compute.v1beta1.CodeInfoResponse;
  return proto.secret.compute.v1beta1.CodeInfoResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.secret.compute.v1beta1.CodeInfoResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.secret.compute.v1beta1.CodeInfoResponse}
 */
proto.secret.compute.v1beta1.CodeInfoResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setCodeId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setCreator(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setCodeHash(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setSource(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setBuilder(value);
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
proto.secret.compute.v1beta1.CodeInfoResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.secret.compute.v1beta1.CodeInfoResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.secret.compute.v1beta1.CodeInfoResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.secret.compute.v1beta1.CodeInfoResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCodeId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getCreator();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getCodeHash();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getSource();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getBuilder();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
};


/**
 * optional uint64 code_id = 1;
 * @return {number}
 */
proto.secret.compute.v1beta1.CodeInfoResponse.prototype.getCodeId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.secret.compute.v1beta1.CodeInfoResponse} returns this
 */
proto.secret.compute.v1beta1.CodeInfoResponse.prototype.setCodeId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string creator = 2;
 * @return {string}
 */
proto.secret.compute.v1beta1.CodeInfoResponse.prototype.getCreator = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.secret.compute.v1beta1.CodeInfoResponse} returns this
 */
proto.secret.compute.v1beta1.CodeInfoResponse.prototype.setCreator = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string code_hash = 3;
 * @return {string}
 */
proto.secret.compute.v1beta1.CodeInfoResponse.prototype.getCodeHash = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.secret.compute.v1beta1.CodeInfoResponse} returns this
 */
proto.secret.compute.v1beta1.CodeInfoResponse.prototype.setCodeHash = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string source = 4;
 * @return {string}
 */
proto.secret.compute.v1beta1.CodeInfoResponse.prototype.getSource = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.secret.compute.v1beta1.CodeInfoResponse} returns this
 */
proto.secret.compute.v1beta1.CodeInfoResponse.prototype.setSource = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string builder = 5;
 * @return {string}
 */
proto.secret.compute.v1beta1.CodeInfoResponse.prototype.getBuilder = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.secret.compute.v1beta1.CodeInfoResponse} returns this
 */
proto.secret.compute.v1beta1.CodeInfoResponse.prototype.setBuilder = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


