// source: desmos/profiles/v1beta1/models_chain_links.proto
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

goog.provide('proto.desmos.profiles.v1beta1.ChainLink');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.desmos.profiles.v1beta1.ChainConfig');
goog.require('proto.desmos.profiles.v1beta1.Proof');
goog.require('proto.google.protobuf.Any');
goog.require('proto.google.protobuf.Timestamp');

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
proto.desmos.profiles.v1beta1.ChainLink = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.desmos.profiles.v1beta1.ChainLink, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.desmos.profiles.v1beta1.ChainLink.displayName = 'proto.desmos.profiles.v1beta1.ChainLink';
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
proto.desmos.profiles.v1beta1.ChainLink.prototype.toObject = function(opt_includeInstance) {
  return proto.desmos.profiles.v1beta1.ChainLink.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.desmos.profiles.v1beta1.ChainLink} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.profiles.v1beta1.ChainLink.toObject = function(includeInstance, msg) {
  var f, obj = {
    user: jspb.Message.getFieldWithDefault(msg, 1, ""),
    address: (f = msg.getAddress()) && proto.google.protobuf.Any.toObject(includeInstance, f),
    proof: (f = msg.getProof()) && proto.desmos.profiles.v1beta1.Proof.toObject(includeInstance, f),
    chainConfig: (f = msg.getChainConfig()) && proto.desmos.profiles.v1beta1.ChainConfig.toObject(includeInstance, f),
    creationTime: (f = msg.getCreationTime()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f)
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
 * @return {!proto.desmos.profiles.v1beta1.ChainLink}
 */
proto.desmos.profiles.v1beta1.ChainLink.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.desmos.profiles.v1beta1.ChainLink;
  return proto.desmos.profiles.v1beta1.ChainLink.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.desmos.profiles.v1beta1.ChainLink} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.desmos.profiles.v1beta1.ChainLink}
 */
proto.desmos.profiles.v1beta1.ChainLink.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setUser(value);
      break;
    case 2:
      var value = new proto.google.protobuf.Any;
      reader.readMessage(value,proto.google.protobuf.Any.deserializeBinaryFromReader);
      msg.setAddress(value);
      break;
    case 3:
      var value = new proto.desmos.profiles.v1beta1.Proof;
      reader.readMessage(value,proto.desmos.profiles.v1beta1.Proof.deserializeBinaryFromReader);
      msg.setProof(value);
      break;
    case 4:
      var value = new proto.desmos.profiles.v1beta1.ChainConfig;
      reader.readMessage(value,proto.desmos.profiles.v1beta1.ChainConfig.deserializeBinaryFromReader);
      msg.setChainConfig(value);
      break;
    case 5:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setCreationTime(value);
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
proto.desmos.profiles.v1beta1.ChainLink.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.desmos.profiles.v1beta1.ChainLink.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.desmos.profiles.v1beta1.ChainLink} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.profiles.v1beta1.ChainLink.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getUser();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getAddress();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.google.protobuf.Any.serializeBinaryToWriter
    );
  }
  f = message.getProof();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.desmos.profiles.v1beta1.Proof.serializeBinaryToWriter
    );
  }
  f = message.getChainConfig();
  if (f != null) {
    writer.writeMessage(
      4,
      f,
      proto.desmos.profiles.v1beta1.ChainConfig.serializeBinaryToWriter
    );
  }
  f = message.getCreationTime();
  if (f != null) {
    writer.writeMessage(
      5,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
};


/**
 * optional string user = 1;
 * @return {string}
 */
proto.desmos.profiles.v1beta1.ChainLink.prototype.getUser = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.desmos.profiles.v1beta1.ChainLink} returns this
 */
proto.desmos.profiles.v1beta1.ChainLink.prototype.setUser = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional google.protobuf.Any address = 2;
 * @return {?proto.google.protobuf.Any}
 */
proto.desmos.profiles.v1beta1.ChainLink.prototype.getAddress = function() {
  return /** @type{?proto.google.protobuf.Any} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Any, 2));
};


/**
 * @param {?proto.google.protobuf.Any|undefined} value
 * @return {!proto.desmos.profiles.v1beta1.ChainLink} returns this
*/
proto.desmos.profiles.v1beta1.ChainLink.prototype.setAddress = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.desmos.profiles.v1beta1.ChainLink} returns this
 */
proto.desmos.profiles.v1beta1.ChainLink.prototype.clearAddress = function() {
  return this.setAddress(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.desmos.profiles.v1beta1.ChainLink.prototype.hasAddress = function() {
  return jspb.Message.getField(this, 2) != null;
};


/**
 * optional Proof proof = 3;
 * @return {?proto.desmos.profiles.v1beta1.Proof}
 */
proto.desmos.profiles.v1beta1.ChainLink.prototype.getProof = function() {
  return /** @type{?proto.desmos.profiles.v1beta1.Proof} */ (
    jspb.Message.getWrapperField(this, proto.desmos.profiles.v1beta1.Proof, 3));
};


/**
 * @param {?proto.desmos.profiles.v1beta1.Proof|undefined} value
 * @return {!proto.desmos.profiles.v1beta1.ChainLink} returns this
*/
proto.desmos.profiles.v1beta1.ChainLink.prototype.setProof = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.desmos.profiles.v1beta1.ChainLink} returns this
 */
proto.desmos.profiles.v1beta1.ChainLink.prototype.clearProof = function() {
  return this.setProof(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.desmos.profiles.v1beta1.ChainLink.prototype.hasProof = function() {
  return jspb.Message.getField(this, 3) != null;
};


/**
 * optional ChainConfig chain_config = 4;
 * @return {?proto.desmos.profiles.v1beta1.ChainConfig}
 */
proto.desmos.profiles.v1beta1.ChainLink.prototype.getChainConfig = function() {
  return /** @type{?proto.desmos.profiles.v1beta1.ChainConfig} */ (
    jspb.Message.getWrapperField(this, proto.desmos.profiles.v1beta1.ChainConfig, 4));
};


/**
 * @param {?proto.desmos.profiles.v1beta1.ChainConfig|undefined} value
 * @return {!proto.desmos.profiles.v1beta1.ChainLink} returns this
*/
proto.desmos.profiles.v1beta1.ChainLink.prototype.setChainConfig = function(value) {
  return jspb.Message.setWrapperField(this, 4, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.desmos.profiles.v1beta1.ChainLink} returns this
 */
proto.desmos.profiles.v1beta1.ChainLink.prototype.clearChainConfig = function() {
  return this.setChainConfig(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.desmos.profiles.v1beta1.ChainLink.prototype.hasChainConfig = function() {
  return jspb.Message.getField(this, 4) != null;
};


/**
 * optional google.protobuf.Timestamp creation_time = 5;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.desmos.profiles.v1beta1.ChainLink.prototype.getCreationTime = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 5));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.desmos.profiles.v1beta1.ChainLink} returns this
*/
proto.desmos.profiles.v1beta1.ChainLink.prototype.setCreationTime = function(value) {
  return jspb.Message.setWrapperField(this, 5, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.desmos.profiles.v1beta1.ChainLink} returns this
 */
proto.desmos.profiles.v1beta1.ChainLink.prototype.clearCreationTime = function() {
  return this.setCreationTime(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.desmos.profiles.v1beta1.ChainLink.prototype.hasCreationTime = function() {
  return jspb.Message.getField(this, 5) != null;
};


