// source: desmos/posts/v2/models.proto
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

goog.provide('proto.desmos.posts.v2.Post');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.desmos.posts.v2.Entities');
goog.require('proto.desmos.posts.v2.PostReference');
goog.require('proto.google.protobuf.Timestamp');

goog.forwardDeclare('proto.desmos.posts.v2.ReplySetting');
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
proto.desmos.posts.v2.Post = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.desmos.posts.v2.Post.repeatedFields_, null);
};
goog.inherits(proto.desmos.posts.v2.Post, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.desmos.posts.v2.Post.displayName = 'proto.desmos.posts.v2.Post';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.desmos.posts.v2.Post.repeatedFields_ = [7,10];



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
proto.desmos.posts.v2.Post.prototype.toObject = function(opt_includeInstance) {
  return proto.desmos.posts.v2.Post.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.desmos.posts.v2.Post} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.posts.v2.Post.toObject = function(includeInstance, msg) {
  var f, obj = {
    subspaceId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    sectionId: jspb.Message.getFieldWithDefault(msg, 2, 0),
    id: jspb.Message.getFieldWithDefault(msg, 3, 0),
    externalId: jspb.Message.getFieldWithDefault(msg, 4, ""),
    text: jspb.Message.getFieldWithDefault(msg, 5, ""),
    entities: (f = msg.getEntities()) && proto.desmos.posts.v2.Entities.toObject(includeInstance, f),
    tagsList: (f = jspb.Message.getRepeatedField(msg, 7)) == null ? undefined : f,
    author: jspb.Message.getFieldWithDefault(msg, 8, ""),
    conversationId: jspb.Message.getFieldWithDefault(msg, 9, 0),
    referencedPostsList: jspb.Message.toObjectList(msg.getReferencedPostsList(),
    proto.desmos.posts.v2.PostReference.toObject, includeInstance),
    replySettings: jspb.Message.getFieldWithDefault(msg, 11, 0),
    creationDate: (f = msg.getCreationDate()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f),
    lastEditedDate: (f = msg.getLastEditedDate()) && proto.google.protobuf.Timestamp.toObject(includeInstance, f)
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
 * @return {!proto.desmos.posts.v2.Post}
 */
proto.desmos.posts.v2.Post.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.desmos.posts.v2.Post;
  return proto.desmos.posts.v2.Post.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.desmos.posts.v2.Post} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.desmos.posts.v2.Post}
 */
proto.desmos.posts.v2.Post.deserializeBinaryFromReader = function(msg, reader) {
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
      var value = /** @type {number} */ (reader.readUint32());
      msg.setSectionId(value);
      break;
    case 3:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setId(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setExternalId(value);
      break;
    case 5:
      var value = /** @type {string} */ (reader.readString());
      msg.setText(value);
      break;
    case 6:
      var value = new proto.desmos.posts.v2.Entities;
      reader.readMessage(value,proto.desmos.posts.v2.Entities.deserializeBinaryFromReader);
      msg.setEntities(value);
      break;
    case 7:
      var value = /** @type {string} */ (reader.readString());
      msg.addTags(value);
      break;
    case 8:
      var value = /** @type {string} */ (reader.readString());
      msg.setAuthor(value);
      break;
    case 9:
      var value = /** @type {number} */ (reader.readUint64());
      msg.setConversationId(value);
      break;
    case 10:
      var value = new proto.desmos.posts.v2.PostReference;
      reader.readMessage(value,proto.desmos.posts.v2.PostReference.deserializeBinaryFromReader);
      msg.addReferencedPosts(value);
      break;
    case 11:
      var value = /** @type {!proto.desmos.posts.v2.ReplySetting} */ (reader.readEnum());
      msg.setReplySettings(value);
      break;
    case 12:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setCreationDate(value);
      break;
    case 13:
      var value = new proto.google.protobuf.Timestamp;
      reader.readMessage(value,proto.google.protobuf.Timestamp.deserializeBinaryFromReader);
      msg.setLastEditedDate(value);
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
proto.desmos.posts.v2.Post.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.desmos.posts.v2.Post.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.desmos.posts.v2.Post} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.posts.v2.Post.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getSubspaceId();
  if (f !== 0) {
    writer.writeUint64(
      1,
      f
    );
  }
  f = message.getSectionId();
  if (f !== 0) {
    writer.writeUint32(
      2,
      f
    );
  }
  f = message.getId();
  if (f !== 0) {
    writer.writeUint64(
      3,
      f
    );
  }
  f = message.getExternalId();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getText();
  if (f.length > 0) {
    writer.writeString(
      5,
      f
    );
  }
  f = message.getEntities();
  if (f != null) {
    writer.writeMessage(
      6,
      f,
      proto.desmos.posts.v2.Entities.serializeBinaryToWriter
    );
  }
  f = message.getTagsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      7,
      f
    );
  }
  f = message.getAuthor();
  if (f.length > 0) {
    writer.writeString(
      8,
      f
    );
  }
  f = message.getConversationId();
  if (f !== 0) {
    writer.writeUint64(
      9,
      f
    );
  }
  f = message.getReferencedPostsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      10,
      f,
      proto.desmos.posts.v2.PostReference.serializeBinaryToWriter
    );
  }
  f = message.getReplySettings();
  if (f !== 0.0) {
    writer.writeEnum(
      11,
      f
    );
  }
  f = message.getCreationDate();
  if (f != null) {
    writer.writeMessage(
      12,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
  f = message.getLastEditedDate();
  if (f != null) {
    writer.writeMessage(
      13,
      f,
      proto.google.protobuf.Timestamp.serializeBinaryToWriter
    );
  }
};


/**
 * optional uint64 subspace_id = 1;
 * @return {number}
 */
proto.desmos.posts.v2.Post.prototype.getSubspaceId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.desmos.posts.v2.Post} returns this
 */
proto.desmos.posts.v2.Post.prototype.setSubspaceId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional uint32 section_id = 2;
 * @return {number}
 */
proto.desmos.posts.v2.Post.prototype.getSectionId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/**
 * @param {number} value
 * @return {!proto.desmos.posts.v2.Post} returns this
 */
proto.desmos.posts.v2.Post.prototype.setSectionId = function(value) {
  return jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional uint64 id = 3;
 * @return {number}
 */
proto.desmos.posts.v2.Post.prototype.getId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 3, 0));
};


/**
 * @param {number} value
 * @return {!proto.desmos.posts.v2.Post} returns this
 */
proto.desmos.posts.v2.Post.prototype.setId = function(value) {
  return jspb.Message.setProto3IntField(this, 3, value);
};


/**
 * optional string external_id = 4;
 * @return {string}
 */
proto.desmos.posts.v2.Post.prototype.getExternalId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.desmos.posts.v2.Post} returns this
 */
proto.desmos.posts.v2.Post.prototype.setExternalId = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * optional string text = 5;
 * @return {string}
 */
proto.desmos.posts.v2.Post.prototype.getText = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 5, ""));
};


/**
 * @param {string} value
 * @return {!proto.desmos.posts.v2.Post} returns this
 */
proto.desmos.posts.v2.Post.prototype.setText = function(value) {
  return jspb.Message.setProto3StringField(this, 5, value);
};


/**
 * optional Entities entities = 6;
 * @return {?proto.desmos.posts.v2.Entities}
 */
proto.desmos.posts.v2.Post.prototype.getEntities = function() {
  return /** @type{?proto.desmos.posts.v2.Entities} */ (
    jspb.Message.getWrapperField(this, proto.desmos.posts.v2.Entities, 6));
};


/**
 * @param {?proto.desmos.posts.v2.Entities|undefined} value
 * @return {!proto.desmos.posts.v2.Post} returns this
*/
proto.desmos.posts.v2.Post.prototype.setEntities = function(value) {
  return jspb.Message.setWrapperField(this, 6, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.desmos.posts.v2.Post} returns this
 */
proto.desmos.posts.v2.Post.prototype.clearEntities = function() {
  return this.setEntities(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.desmos.posts.v2.Post.prototype.hasEntities = function() {
  return jspb.Message.getField(this, 6) != null;
};


/**
 * repeated string tags = 7;
 * @return {!Array<string>}
 */
proto.desmos.posts.v2.Post.prototype.getTagsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 7));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.desmos.posts.v2.Post} returns this
 */
proto.desmos.posts.v2.Post.prototype.setTagsList = function(value) {
  return jspb.Message.setField(this, 7, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.desmos.posts.v2.Post} returns this
 */
proto.desmos.posts.v2.Post.prototype.addTags = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 7, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.desmos.posts.v2.Post} returns this
 */
proto.desmos.posts.v2.Post.prototype.clearTagsList = function() {
  return this.setTagsList([]);
};


/**
 * optional string author = 8;
 * @return {string}
 */
proto.desmos.posts.v2.Post.prototype.getAuthor = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 8, ""));
};


/**
 * @param {string} value
 * @return {!proto.desmos.posts.v2.Post} returns this
 */
proto.desmos.posts.v2.Post.prototype.setAuthor = function(value) {
  return jspb.Message.setProto3StringField(this, 8, value);
};


/**
 * optional uint64 conversation_id = 9;
 * @return {number}
 */
proto.desmos.posts.v2.Post.prototype.getConversationId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 9, 0));
};


/**
 * @param {number} value
 * @return {!proto.desmos.posts.v2.Post} returns this
 */
proto.desmos.posts.v2.Post.prototype.setConversationId = function(value) {
  return jspb.Message.setProto3IntField(this, 9, value);
};


/**
 * repeated PostReference referenced_posts = 10;
 * @return {!Array<!proto.desmos.posts.v2.PostReference>}
 */
proto.desmos.posts.v2.Post.prototype.getReferencedPostsList = function() {
  return /** @type{!Array<!proto.desmos.posts.v2.PostReference>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.desmos.posts.v2.PostReference, 10));
};


/**
 * @param {!Array<!proto.desmos.posts.v2.PostReference>} value
 * @return {!proto.desmos.posts.v2.Post} returns this
*/
proto.desmos.posts.v2.Post.prototype.setReferencedPostsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 10, value);
};


/**
 * @param {!proto.desmos.posts.v2.PostReference=} opt_value
 * @param {number=} opt_index
 * @return {!proto.desmos.posts.v2.PostReference}
 */
proto.desmos.posts.v2.Post.prototype.addReferencedPosts = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 10, opt_value, proto.desmos.posts.v2.PostReference, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.desmos.posts.v2.Post} returns this
 */
proto.desmos.posts.v2.Post.prototype.clearReferencedPostsList = function() {
  return this.setReferencedPostsList([]);
};


/**
 * optional ReplySetting reply_settings = 11;
 * @return {!proto.desmos.posts.v2.ReplySetting}
 */
proto.desmos.posts.v2.Post.prototype.getReplySettings = function() {
  return /** @type {!proto.desmos.posts.v2.ReplySetting} */ (jspb.Message.getFieldWithDefault(this, 11, 0));
};


/**
 * @param {!proto.desmos.posts.v2.ReplySetting} value
 * @return {!proto.desmos.posts.v2.Post} returns this
 */
proto.desmos.posts.v2.Post.prototype.setReplySettings = function(value) {
  return jspb.Message.setProto3EnumField(this, 11, value);
};


/**
 * optional google.protobuf.Timestamp creation_date = 12;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.desmos.posts.v2.Post.prototype.getCreationDate = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 12));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.desmos.posts.v2.Post} returns this
*/
proto.desmos.posts.v2.Post.prototype.setCreationDate = function(value) {
  return jspb.Message.setWrapperField(this, 12, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.desmos.posts.v2.Post} returns this
 */
proto.desmos.posts.v2.Post.prototype.clearCreationDate = function() {
  return this.setCreationDate(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.desmos.posts.v2.Post.prototype.hasCreationDate = function() {
  return jspb.Message.getField(this, 12) != null;
};


/**
 * optional google.protobuf.Timestamp last_edited_date = 13;
 * @return {?proto.google.protobuf.Timestamp}
 */
proto.desmos.posts.v2.Post.prototype.getLastEditedDate = function() {
  return /** @type{?proto.google.protobuf.Timestamp} */ (
    jspb.Message.getWrapperField(this, proto.google.protobuf.Timestamp, 13));
};


/**
 * @param {?proto.google.protobuf.Timestamp|undefined} value
 * @return {!proto.desmos.posts.v2.Post} returns this
*/
proto.desmos.posts.v2.Post.prototype.setLastEditedDate = function(value) {
  return jspb.Message.setWrapperField(this, 13, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.desmos.posts.v2.Post} returns this
 */
proto.desmos.posts.v2.Post.prototype.clearLastEditedDate = function() {
  return this.setLastEditedDate(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.desmos.posts.v2.Post.prototype.hasLastEditedDate = function() {
  return jspb.Message.getField(this, 13) != null;
};


