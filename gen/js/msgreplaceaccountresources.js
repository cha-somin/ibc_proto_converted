// source: iov/starname/v1beta1/tx.proto
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

goog.provide('proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.starnamed.x.starname.v1beta1.Resource');

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
proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources.repeatedFields_, null);
};
goog.inherits(proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources.displayName = 'proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources.repeatedFields_ = [5];



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
proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources.prototype.toObject = function(opt_includeInstance) {
  return proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources.toObject = function(includeInstance, msg) {
  var f, obj = {
    domain: jspb.Message.getFieldWithDefault(msg, 1, ""),
    name: jspb.Message.getFieldWithDefault(msg, 2, ""),
    owner: jspb.Message.getFieldWithDefault(msg, 3, ""),
    payer: jspb.Message.getFieldWithDefault(msg, 4, ""),
    newResourcesList: jspb.Message.toObjectList(msg.getNewResourcesList(),
    proto.starnamed.x.starname.v1beta1.Resource.toObject, includeInstance)
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
 * @return {!proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources}
 */
proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources;
  return proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources}
 */
proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setDomain(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setName(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setOwner(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setPayer(value);
      break;
    case 5:
      var value = new proto.starnamed.x.starname.v1beta1.Resource;
      reader.readMessage(value,proto.starnamed.x.starname.v1beta1.Resource.deserializeBinaryFromReader);
      msg.addNewResources(value);
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
proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDomain();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getName();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getOwner();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getPayer();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
  f = message.getNewResourcesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      5,
      f,
      proto.starnamed.x.starname.v1beta1.Resource.serializeBinaryToWriter
    );
  }
};


/**
 * optional string domain = 1;
 * @return {string}
 */
proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources.prototype.getDomain = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources} returns this
 */
proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources.prototype.setDomain = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string name = 2;
 * @return {string}
 */
proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources.prototype.getName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources} returns this
 */
proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources.prototype.setName = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string owner = 3;
 * @return {string}
 */
proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources.prototype.getOwner = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources} returns this
 */
proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources.prototype.setOwner = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string payer = 4;
 * @return {string}
 */
proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources.prototype.getPayer = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/**
 * @param {string} value
 * @return {!proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources} returns this
 */
proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources.prototype.setPayer = function(value) {
  return jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * repeated Resource new_resources = 5;
 * @return {!Array<!proto.starnamed.x.starname.v1beta1.Resource>}
 */
proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources.prototype.getNewResourcesList = function() {
  return /** @type{!Array<!proto.starnamed.x.starname.v1beta1.Resource>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.starnamed.x.starname.v1beta1.Resource, 5));
};


/**
 * @param {!Array<!proto.starnamed.x.starname.v1beta1.Resource>} value
 * @return {!proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources} returns this
*/
proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources.prototype.setNewResourcesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 5, value);
};


/**
 * @param {!proto.starnamed.x.starname.v1beta1.Resource=} opt_value
 * @param {number=} opt_index
 * @return {!proto.starnamed.x.starname.v1beta1.Resource}
 */
proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources.prototype.addNewResources = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 5, opt_value, proto.starnamed.x.starname.v1beta1.Resource, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources} returns this
 */
proto.starnamed.x.starname.v1beta1.MsgReplaceAccountResources.prototype.clearNewResourcesList = function() {
  return this.setNewResourcesList([]);
};


