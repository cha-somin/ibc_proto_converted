// source: ibc/lightclients/solomachine/v2/solomachine.proto
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

goog.provide('proto.ibc.lightclients.solomachine.v2.ConsensusStateData');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.google.protobuf.Any');

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
proto.ibc.lightclients.solomachine.v2.ConsensusStateData = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.ibc.lightclients.solomachine.v2.ConsensusStateData, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.ibc.lightclients.solomachine.v2.ConsensusStateData.displayName = 'proto.ibc.lightclients.solomachine.v2.ConsensusStateData';
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
proto.ibc.lightclients.solomachine.v2.ConsensusStateData.prototype.toObject = function(opt_includeInstance) {
  return proto.ibc.lightclients.solomachine.v2.ConsensusStateData.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.ibc.lightclients.solomachine.v2.ConsensusStateData} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.lightclients.solomachine.v2.ConsensusStateData.toObject = function(includeInstance, msg) {
  var f, obj = {
    path: msg.getPath_asB64(),
    consensusState: (f = msg.getConsensusState()) && proto.google.protobuf.Any.toObject(includeInstance, f)
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
 * @return {!proto.ibc.lightclients.solomachine.v2.ConsensusStateData}
 */
proto.ibc.lightclients.solomachine.v2.ConsensusStateData.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.ibc.lightclients.solomachine.v2.ConsensusStateData;
  return proto.ibc.lightclients.solomachine.v2.ConsensusStateData.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.ibc.lightclients.solomachine.v2.ConsensusStateData} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.ibc.lightclients.solomachine.v2.ConsensusStateData}
 */
proto.ibc.lightclients.solomachine.v2.ConsensusStateData.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setPath(value);
      break;
    case 2:
      var value = new proto.google.protobuf.Any;
      reader.readMessage(value,proto.google.protobuf.Any.deserializeBinaryFromReader);
      msg.setConsensusState(value);
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
proto.ibc.lightclients.solomachine.v2.ConsensusStateData.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.ibc.lightclients.solomachine.v2.ConsensusStateData.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.ibc.lightclients.solomachine.v2.ConsensusStateData} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.ibc.lightclients.solomachine.v2.ConsensusStateData.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPath_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      1,
      f
    );
  }
  f = message.getConsensusState();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.google.protobuf.Any.serializeBinaryToWriter
    );
  }
};


/**
 * optional bytes path = 1;
 * @return {string}
 */
proto.ibc.lightclients.solomachine.v2.ConsensusStateData.prototype.getPath = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * optional bytes path = 1;
 * This is a type-conversion wrapper around `getPath()`
 * @return {string}
 */
proto.ibc.lightclients.solomachine.v2.ConsensusStateData.prototype.getPath_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getPath()));
};


/**
 * optional bytes path = 1;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getPath()`
 * @return {!Uint8Array}
 */
proto.ibc.lightclients.solomachine.v2.ConsensusStateData.prototype.getPath_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getPath()));
};


/**
 * @param {!(string|Uint8Array)} value
 * @return {!proto.ibc.lightclients.solomachine.v2.ConsensusStateData} returns this
 */
proto.ibc.lightclients.solomachine.v2.ConsensusStateData.prototype.setPath = function(value) {
  return jspb.Message.setProto3BytesField(this, 1, value);
};


/**
 * optional google.protobuf.Any consensus_state = 2;
 * @return {?proto.google.protobuf.Any}
 */
proto.ibc.lightclients.solomachine.v2.ConsensusStateData.prototype.getConsensusState = function() {
  return /** @type{?proto.google.protobuf.Any} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Any, 2));
};


/**
 * @param {?proto.google.protobuf.Any|undefined} value
 * @return {!proto.ibc.lightclients.solomachine.v2.ConsensusStateData} returns this
*/
proto.ibc.lightclients.solomachine.v2.ConsensusStateData.prototype.setConsensusState = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.ibc.lightclients.solomachine.v2.ConsensusStateData} returns this
 */
proto.ibc.lightclients.solomachine.v2.ConsensusStateData.prototype.clearConsensusState = function() {
  return this.setConsensusState(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.ibc.lightclients.solomachine.v2.ConsensusStateData.prototype.hasConsensusState = function() {
  return jspb.Message.getField(this, 2) != null;
};


