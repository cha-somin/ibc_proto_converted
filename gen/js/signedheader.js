// source: tendermint/types/types.proto
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

goog.provide('proto.tendermint.types.SignedHeader');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.tendermint.types.Commit');
goog.require('proto.tendermint.types.Header');

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
proto.tendermint.types.SignedHeader = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.tendermint.types.SignedHeader, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.tendermint.types.SignedHeader.displayName = 'proto.tendermint.types.SignedHeader';
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
proto.tendermint.types.SignedHeader.prototype.toObject = function(opt_includeInstance) {
  return proto.tendermint.types.SignedHeader.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.tendermint.types.SignedHeader} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.tendermint.types.SignedHeader.toObject = function(includeInstance, msg) {
  var f, obj = {
    header: (f = msg.getHeader()) && proto.tendermint.types.Header.toObject(includeInstance, f),
    commit: (f = msg.getCommit()) && proto.tendermint.types.Commit.toObject(includeInstance, f)
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
 * @return {!proto.tendermint.types.SignedHeader}
 */
proto.tendermint.types.SignedHeader.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.tendermint.types.SignedHeader;
  return proto.tendermint.types.SignedHeader.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.tendermint.types.SignedHeader} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.tendermint.types.SignedHeader}
 */
proto.tendermint.types.SignedHeader.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.tendermint.types.Header;
      reader.readMessage(value,proto.tendermint.types.Header.deserializeBinaryFromReader);
      msg.setHeader(value);
      break;
    case 2:
      var value = new proto.tendermint.types.Commit;
      reader.readMessage(value,proto.tendermint.types.Commit.deserializeBinaryFromReader);
      msg.setCommit(value);
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
proto.tendermint.types.SignedHeader.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.tendermint.types.SignedHeader.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.tendermint.types.SignedHeader} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.tendermint.types.SignedHeader.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getHeader();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.tendermint.types.Header.serializeBinaryToWriter
    );
  }
  f = message.getCommit();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.tendermint.types.Commit.serializeBinaryToWriter
    );
  }
};


/**
 * optional Header header = 1;
 * @return {?proto.tendermint.types.Header}
 */
proto.tendermint.types.SignedHeader.prototype.getHeader = function() {
  return /** @type{?proto.tendermint.types.Header} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.types.Header, 1));
};


/**
 * @param {?proto.tendermint.types.Header|undefined} value
 * @return {!proto.tendermint.types.SignedHeader} returns this
*/
proto.tendermint.types.SignedHeader.prototype.setHeader = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.types.SignedHeader} returns this
 */
proto.tendermint.types.SignedHeader.prototype.clearHeader = function() {
  return this.setHeader(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.types.SignedHeader.prototype.hasHeader = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * optional Commit commit = 2;
 * @return {?proto.tendermint.types.Commit}
 */
proto.tendermint.types.SignedHeader.prototype.getCommit = function() {
  return /** @type{?proto.tendermint.types.Commit} */ (
    jspb.Message.getWrapperField(this, proto.tendermint.types.Commit, 2));
};


/**
 * @param {?proto.tendermint.types.Commit|undefined} value
 * @return {!proto.tendermint.types.SignedHeader} returns this
*/
proto.tendermint.types.SignedHeader.prototype.setCommit = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.tendermint.types.SignedHeader} returns this
 */
proto.tendermint.types.SignedHeader.prototype.clearCommit = function() {
  return this.setCommit(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.tendermint.types.SignedHeader.prototype.hasCommit = function() {
  return jspb.Message.getField(this, 2) != null;
};


