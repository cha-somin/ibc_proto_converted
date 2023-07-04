// source: cosmos/group/v1/types.proto
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

goog.provide('proto.cosmos.group.v1.TallyResult');

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
proto.cosmos.group.v1.TallyResult = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.cosmos.group.v1.TallyResult, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.group.v1.TallyResult.displayName = 'proto.cosmos.group.v1.TallyResult';
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
proto.cosmos.group.v1.TallyResult.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.group.v1.TallyResult.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.group.v1.TallyResult} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.group.v1.TallyResult.toObject = function(includeInstance, msg) {
  var f, obj = {
    yesCount: jspb.Message.getFieldWithDefault(msg, 1, ""),
    abstainCount: jspb.Message.getFieldWithDefault(msg, 2, ""),
    noCount: jspb.Message.getFieldWithDefault(msg, 3, ""),
    noWithVetoCount: jspb.Message.getFieldWithDefault(msg, 4, "")
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
 * @return {!proto.cosmos.group.v1.TallyResult}
 */
proto.cosmos.group.v1.TallyResult.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.group.v1.TallyResult;
  return proto.cosmos.group.v1.TallyResult.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.group.v1.TallyResult} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.group.v1.TallyResult}
 */
proto.cosmos.group.v1.TallyResult.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setYesCount(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setAbstainCount(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setNoCount(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setNoWithVetoCount(value);
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
proto.cosmos.group.v1.TallyResult.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.group.v1.TallyResult.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.group.v1.TallyResult} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.group.v1.TallyResult.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getYesCount();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getAbstainCount();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getNoCount();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getNoWithVetoCount();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional string yes_count = 1;
 * @return {string}
 */
proto.cosmos.group.v1.TallyResult.prototype.getYesCount = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.group.v1.TallyResult} returns this
 */
proto.cosmos.group.v1.TallyResult.prototype.setYesCount = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string abstain_count = 2;
 * @return {string}
 */
proto.cosmos.group.v1.TallyResult.prototype.getAbstainCount = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.group.v1.TallyResult} returns this
 */
proto.cosmos.group.v1.TallyResult.prototype.setAbstainCount = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string no_count = 3;
 * @return {string}
 */
proto.cosmos.group.v1.TallyResult.prototype.getNoCount = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.group.v1.TallyResult} returns this
 */
proto.cosmos.group.v1.TallyResult.prototype.setNoCount = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string no_with_veto_count = 4;
 * @return {string}
 */
proto.cosmos.group.v1.TallyResult.prototype.getNoWithVetoCount = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.group.v1.TallyResult} returns this
 */
proto.cosmos.group.v1.TallyResult.prototype.setNoWithVetoCount = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};

