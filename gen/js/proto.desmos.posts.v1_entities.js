// source: desmos/posts/v1/models.proto
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

goog.provide('proto.desmos.posts.v1.Entities');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.desmos.posts.v1.Tag');
goog.require('proto.desmos.posts.v1.Url');

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
proto.desmos.posts.v1.Entities = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.desmos.posts.v1.Entities.repeatedFields_, null);
};
goog.inherits(proto.desmos.posts.v1.Entities, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.desmos.posts.v1.Entities.displayName = 'proto.desmos.posts.v1.Entities';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.desmos.posts.v1.Entities.repeatedFields_ = [1,2,3];



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
proto.desmos.posts.v1.Entities.prototype.toObject = function(opt_includeInstance) {
  return proto.desmos.posts.v1.Entities.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.desmos.posts.v1.Entities} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.posts.v1.Entities.toObject = function(includeInstance, msg) {
  var f, obj = {
    hashtagsList: jspb.Message.toObjectList(msg.getHashtagsList(),
    proto.desmos.posts.v1.Tag.toObject, includeInstance),
    mentionsList: jspb.Message.toObjectList(msg.getMentionsList(),
    proto.desmos.posts.v1.Tag.toObject, includeInstance),
    urlsList: jspb.Message.toObjectList(msg.getUrlsList(),
    proto.desmos.posts.v1.Url.toObject, includeInstance)
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
 * @return {!proto.desmos.posts.v1.Entities}
 */
proto.desmos.posts.v1.Entities.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.desmos.posts.v1.Entities;
  return proto.desmos.posts.v1.Entities.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.desmos.posts.v1.Entities} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.desmos.posts.v1.Entities}
 */
proto.desmos.posts.v1.Entities.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.desmos.posts.v1.Tag;
      reader.readMessage(value,proto.desmos.posts.v1.Tag.deserializeBinaryFromReader);
      msg.addHashtags(value);
      break;
    case 2:
      var value = new proto.desmos.posts.v1.Tag;
      reader.readMessage(value,proto.desmos.posts.v1.Tag.deserializeBinaryFromReader);
      msg.addMentions(value);
      break;
    case 3:
      var value = new proto.desmos.posts.v1.Url;
      reader.readMessage(value,proto.desmos.posts.v1.Url.deserializeBinaryFromReader);
      msg.addUrls(value);
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
proto.desmos.posts.v1.Entities.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.desmos.posts.v1.Entities.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.desmos.posts.v1.Entities} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.posts.v1.Entities.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getHashtagsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.desmos.posts.v1.Tag.serializeBinaryToWriter
    );
  }
  f = message.getMentionsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.desmos.posts.v1.Tag.serializeBinaryToWriter
    );
  }
  f = message.getUrlsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.desmos.posts.v1.Url.serializeBinaryToWriter
    );
  }
};


/**
 * repeated Tag hashtags = 1;
 * @return {!Array<!proto.desmos.posts.v1.Tag>}
 */
proto.desmos.posts.v1.Entities.prototype.getHashtagsList = function() {
  return /** @type{!Array<!proto.desmos.posts.v1.Tag>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.desmos.posts.v1.Tag, 1));
};


/**
 * @param {!Array<!proto.desmos.posts.v1.Tag>} value
 * @return {!proto.desmos.posts.v1.Entities} returns this
*/
proto.desmos.posts.v1.Entities.prototype.setHashtagsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.desmos.posts.v1.Tag=} opt_value
 * @param {number=} opt_index
 * @return {!proto.desmos.posts.v1.Tag}
 */
proto.desmos.posts.v1.Entities.prototype.addHashtags = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.desmos.posts.v1.Tag, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.desmos.posts.v1.Entities} returns this
 */
proto.desmos.posts.v1.Entities.prototype.clearHashtagsList = function() {
  return this.setHashtagsList([]);
};


/**
 * repeated Tag mentions = 2;
 * @return {!Array<!proto.desmos.posts.v1.Tag>}
 */
proto.desmos.posts.v1.Entities.prototype.getMentionsList = function() {
  return /** @type{!Array<!proto.desmos.posts.v1.Tag>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.desmos.posts.v1.Tag, 2));
};


/**
 * @param {!Array<!proto.desmos.posts.v1.Tag>} value
 * @return {!proto.desmos.posts.v1.Entities} returns this
*/
proto.desmos.posts.v1.Entities.prototype.setMentionsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.desmos.posts.v1.Tag=} opt_value
 * @param {number=} opt_index
 * @return {!proto.desmos.posts.v1.Tag}
 */
proto.desmos.posts.v1.Entities.prototype.addMentions = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.desmos.posts.v1.Tag, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.desmos.posts.v1.Entities} returns this
 */
proto.desmos.posts.v1.Entities.prototype.clearMentionsList = function() {
  return this.setMentionsList([]);
};


/**
 * repeated Url urls = 3;
 * @return {!Array<!proto.desmos.posts.v1.Url>}
 */
proto.desmos.posts.v1.Entities.prototype.getUrlsList = function() {
  return /** @type{!Array<!proto.desmos.posts.v1.Url>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.desmos.posts.v1.Url, 3));
};


/**
 * @param {!Array<!proto.desmos.posts.v1.Url>} value
 * @return {!proto.desmos.posts.v1.Entities} returns this
*/
proto.desmos.posts.v1.Entities.prototype.setUrlsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.desmos.posts.v1.Url=} opt_value
 * @param {number=} opt_index
 * @return {!proto.desmos.posts.v1.Url}
 */
proto.desmos.posts.v1.Entities.prototype.addUrls = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.desmos.posts.v1.Url, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.desmos.posts.v1.Entities} returns this
 */
proto.desmos.posts.v1.Entities.prototype.clearUrlsList = function() {
  return this.setUrlsList([]);
};

