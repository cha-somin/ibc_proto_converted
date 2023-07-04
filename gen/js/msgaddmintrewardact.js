// source: stafihub/rmintreward/tx.proto
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

goog.provide('proto.stafihub.stafihub.rmintreward.MsgAddMintRewardAct');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.stafihub.stafihub.rmintreward.MintRewardActPost');

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
proto.stafihub.stafihub.rmintreward.MsgAddMintRewardAct = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.stafihub.stafihub.rmintreward.MsgAddMintRewardAct, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.stafihub.stafihub.rmintreward.MsgAddMintRewardAct.displayName = 'proto.stafihub.stafihub.rmintreward.MsgAddMintRewardAct';
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
proto.stafihub.stafihub.rmintreward.MsgAddMintRewardAct.prototype.toObject = function(opt_includeInstance) {
  return proto.stafihub.stafihub.rmintreward.MsgAddMintRewardAct.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.stafihub.stafihub.rmintreward.MsgAddMintRewardAct} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stafihub.stafihub.rmintreward.MsgAddMintRewardAct.toObject = function(includeInstance, msg) {
  var f, obj = {
    creator: jspb.Message.getFieldWithDefault(msg, 1, ""),
    denom: jspb.Message.getFieldWithDefault(msg, 2, ""),
    act: (f = msg.getAct()) && proto.stafihub.stafihub.rmintreward.MintRewardActPost.toObject(includeInstance, f)
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
 * @return {!proto.stafihub.stafihub.rmintreward.MsgAddMintRewardAct}
 */
proto.stafihub.stafihub.rmintreward.MsgAddMintRewardAct.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.stafihub.stafihub.rmintreward.MsgAddMintRewardAct;
  return proto.stafihub.stafihub.rmintreward.MsgAddMintRewardAct.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.stafihub.stafihub.rmintreward.MsgAddMintRewardAct} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.stafihub.stafihub.rmintreward.MsgAddMintRewardAct}
 */
proto.stafihub.stafihub.rmintreward.MsgAddMintRewardAct.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setCreator(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setDenom(value);
      break;
    case 3:
      var value = new proto.stafihub.stafihub.rmintreward.MintRewardActPost;
      reader.readMessage(value,proto.stafihub.stafihub.rmintreward.MintRewardActPost.deserializeBinaryFromReader);
      msg.setAct(value);
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
proto.stafihub.stafihub.rmintreward.MsgAddMintRewardAct.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.stafihub.stafihub.rmintreward.MsgAddMintRewardAct.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.stafihub.stafihub.rmintreward.MsgAddMintRewardAct} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.stafihub.stafihub.rmintreward.MsgAddMintRewardAct.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCreator();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDenom();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getAct();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.stafihub.stafihub.rmintreward.MintRewardActPost.serializeBinaryToWriter
    );
  }
};


/**
 * optional string creator = 1;
 * @return {string}
 */
proto.stafihub.stafihub.rmintreward.MsgAddMintRewardAct.prototype.getCreator = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.stafihub.stafihub.rmintreward.MsgAddMintRewardAct} returns this
 */
proto.stafihub.stafihub.rmintreward.MsgAddMintRewardAct.prototype.setCreator = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string denom = 2;
 * @return {string}
 */
proto.stafihub.stafihub.rmintreward.MsgAddMintRewardAct.prototype.getDenom = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.stafihub.stafihub.rmintreward.MsgAddMintRewardAct} returns this
 */
proto.stafihub.stafihub.rmintreward.MsgAddMintRewardAct.prototype.setDenom = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional MintRewardActPost act = 3;
 * @return {?proto.stafihub.stafihub.rmintreward.MintRewardActPost}
 */
proto.stafihub.stafihub.rmintreward.MsgAddMintRewardAct.prototype.getAct = function() {
  return /** @type{?proto.stafihub.stafihub.rmintreward.MintRewardActPost} */ (
    jspb.Message.getWrapperField(this, proto.stafihub.stafihub.rmintreward.MintRewardActPost, 3));
};


/**
 * @param {?proto.stafihub.stafihub.rmintreward.MintRewardActPost|undefined} value
 * @return {!proto.stafihub.stafihub.rmintreward.MsgAddMintRewardAct} returns this
*/
proto.stafihub.stafihub.rmintreward.MsgAddMintRewardAct.prototype.setAct = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.stafihub.stafihub.rmintreward.MsgAddMintRewardAct} returns this
 */
proto.stafihub.stafihub.rmintreward.MsgAddMintRewardAct.prototype.clearAct = function() {
  return this.setAct(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.stafihub.stafihub.rmintreward.MsgAddMintRewardAct.prototype.hasAct = function() {
  return jspb.Message.getField(this, 3) != null;
};

