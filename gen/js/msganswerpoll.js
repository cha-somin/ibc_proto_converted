// source: desmos/posts/v3/msgs.proto
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

goog.provide('proto.desmos.posts.v3.MsgAnswerPoll');

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
proto.desmos.posts.v3.MsgAnswerPoll = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.desmos.posts.v3.MsgAnswerPoll.repeatedFields_, null);
};
goog.inherits(proto.desmos.posts.v3.MsgAnswerPoll, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.desmos.posts.v3.MsgAnswerPoll.displayName = 'proto.desmos.posts.v3.MsgAnswerPoll';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.desmos.posts.v3.MsgAnswerPoll.repeatedFields_ = [4];



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
proto.desmos.posts.v3.MsgAnswerPoll.prototype.toObject = function(opt_includeInstance) {
  return proto.desmos.posts.v3.MsgAnswerPoll.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.desmos.posts.v3.MsgAnswerPoll} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.posts.v3.MsgAnswerPoll.toObject = function(includeInstance, msg) {
  var f, obj = {
    subspaceId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    postId: jspb.Message.getFieldWithDefault(msg, 2, 0),
    pollId: jspb.Message.getFieldWithDefault(msg, 3, 0),
    answersIndexesList: (f = jspb.Message.getRepeatedField(msg, 4)) == null ? undefined : f,
    signer: jspb.Message.getFieldWithDefault(msg, 5, "")
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
 * @return {!proto.desmos.posts.v3.MsgAnswerPoll}
 */
proto.desmos.posts.v3.MsgAnswerPoll.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.desmos.posts.v3.MsgAnswerPoll;
  return proto.desmos.posts.v3.MsgAnswerPoll.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.desmos.posts.v3.MsgAnswerPoll} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.desmos.posts.v3.MsgAnswerPoll}
 */
proto.desmos.posts.v3.MsgAnswerPoll.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setSubspaceId(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setPostId(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint32());
      msg.setPollId(value);
      break;
    case 4:
      var values = /** @type {!Array<number>} */ (reader.isDelimited() ? reader.readPackedUint32() : [reader.readUint32()]);
      for (var i = 0; i < values.length; i++) {
        msg.addAnswersIndexes(values[i]);
      }
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setSigner(value);
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
proto.desmos.posts.v3.MsgAnswerPoll.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.desmos.posts.v3.MsgAnswerPoll.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.desmos.posts.v3.MsgAnswerPoll} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.posts.v3.MsgAnswerPoll.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSubspaceId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getPostId();
  if (f !== 0) {
    writer.writeUint64(
      2,
      f
    );
  }
  f = message.getPollId();
  if (f !== 0) {
    writer.writeUint32(
      3,
      f
    );
  }
  f = message.getAnswersIndexesList();
  if (f.length > 0) {
    writer.writePackedUint32(
      4,
      f
    );
  }
  f = message.getSigner();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
};


/**
 * optional uint64 subspace_id = 1;
 * @return {number}
 */
proto.desmos.posts.v3.MsgAnswerPoll.prototype.getSubspaceId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.desmos.posts.v3.MsgAnswerPoll} returns this
 */
proto.desmos.posts.v3.MsgAnswerPoll.prototype.setSubspaceId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint64 post_id = 2;
 * @return {number}
 */
proto.desmos.posts.v3.MsgAnswerPoll.prototype.getPostId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.desmos.posts.v3.MsgAnswerPoll} returns this
 */
proto.desmos.posts.v3.MsgAnswerPoll.prototype.setPostId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional uint32 poll_id = 3;
 * @return {number}
 */
proto.desmos.posts.v3.MsgAnswerPoll.prototype.getPollId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.desmos.posts.v3.MsgAnswerPoll} returns this
 */
proto.desmos.posts.v3.MsgAnswerPoll.prototype.setPollId = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * repeated uint32 answers_indexes = 4;
 * @return {!Array<number>}
 */
proto.desmos.posts.v3.MsgAnswerPoll.prototype.getAnswersIndexesList = function() {
  return /** @type {!Array<number>} */ (jspb.Message.getRepeatedField(this, 4));
};


/**
 * @param {!Array<number>} value
 * @return {!proto.desmos.posts.v3.MsgAnswerPoll} returns this
 */
proto.desmos.posts.v3.MsgAnswerPoll.prototype.setAnswersIndexesList = function(value) {
  return jspb.Message.setField(this, 4, value || []);
};


/**
 * @param {number} value
 * @param {number=} opt_index
 * @return {!proto.desmos.posts.v3.MsgAnswerPoll} returns this
 */
proto.desmos.posts.v3.MsgAnswerPoll.prototype.addAnswersIndexes = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 4, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.desmos.posts.v3.MsgAnswerPoll} returns this
 */
proto.desmos.posts.v3.MsgAnswerPoll.prototype.clearAnswersIndexesList = function() {
  return this.setAnswersIndexesList([]);
};


/**
 * optional string signer = 5;
 * @return {string}
 */
proto.desmos.posts.v3.MsgAnswerPoll.prototype.getSigner = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.desmos.posts.v3.MsgAnswerPoll} returns this
 */
proto.desmos.posts.v3.MsgAnswerPoll.prototype.setSigner = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


