// source: cudos/marketplace/tx.proto
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

goog.provide('proto.cudoventures.cudosnode.marketplace.MsgPublishCollection');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cudoventures.cudosnode.marketplace.Royalty');

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
proto.cudoventures.cudosnode.marketplace.MsgPublishCollection = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cudoventures.cudosnode.marketplace.MsgPublishCollection.repeatedFields_, null);
};
goog.inherits(proto.cudoventures.cudosnode.marketplace.MsgPublishCollection, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cudoventures.cudosnode.marketplace.MsgPublishCollection.displayName = 'proto.cudoventures.cudosnode.marketplace.MsgPublishCollection';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cudoventures.cudosnode.marketplace.MsgPublishCollection.repeatedFields_ = [3,4];



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
proto.cudoventures.cudosnode.marketplace.MsgPublishCollection.prototype.toObject = function(opt_includeInstance) {
  return proto.cudoventures.cudosnode.marketplace.MsgPublishCollection.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cudoventures.cudosnode.marketplace.MsgPublishCollection} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cudoventures.cudosnode.marketplace.MsgPublishCollection.toObject = function(includeInstance, msg) {
  var f, obj = {
    creator: jspb.Message.getFieldWithDefault(msg, 1, ""),
    denomid: jspb.Message.getFieldWithDefault(msg, 2, ""),
    mintroyaltiesList: jspb.Message.toObjectList(msg.getMintroyaltiesList(),
    proto.cudoventures.cudosnode.marketplace.Royalty.toObject, includeInstance),
    resaleroyaltiesList: jspb.Message.toObjectList(msg.getResaleroyaltiesList(),
    proto.cudoventures.cudosnode.marketplace.Royalty.toObject, includeInstance)
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
 * @return {!proto.cudoventures.cudosnode.marketplace.MsgPublishCollection}
 */
proto.cudoventures.cudosnode.marketplace.MsgPublishCollection.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cudoventures.cudosnode.marketplace.MsgPublishCollection;
  return proto.cudoventures.cudosnode.marketplace.MsgPublishCollection.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cudoventures.cudosnode.marketplace.MsgPublishCollection} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cudoventures.cudosnode.marketplace.MsgPublishCollection}
 */
proto.cudoventures.cudosnode.marketplace.MsgPublishCollection.deserializeBinaryFromReader = function(msg, reader) {
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
      msg.setDenomid(value);
      break;
    case 3:
      var value = new proto.cudoventures.cudosnode.marketplace.Royalty;
      reader.readMessage(value,proto.cudoventures.cudosnode.marketplace.Royalty.deserializeBinaryFromReader);
      msg.addMintroyalties(value);
      break;
    case 4:
      var value = new proto.cudoventures.cudosnode.marketplace.Royalty;
      reader.readMessage(value,proto.cudoventures.cudosnode.marketplace.Royalty.deserializeBinaryFromReader);
      msg.addResaleroyalties(value);
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
proto.cudoventures.cudosnode.marketplace.MsgPublishCollection.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cudoventures.cudosnode.marketplace.MsgPublishCollection.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cudoventures.cudosnode.marketplace.MsgPublishCollection} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cudoventures.cudosnode.marketplace.MsgPublishCollection.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCreator();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getDenomid();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getMintroyaltiesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      3,
      f,
      proto.cudoventures.cudosnode.marketplace.Royalty.serializeBinaryToWriter
    );
  }
  f = message.getResaleroyaltiesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      4,
      f,
      proto.cudoventures.cudosnode.marketplace.Royalty.serializeBinaryToWriter
    );
  }
};


/**
 * optional string creator = 1;
 * @return {string}
 */
proto.cudoventures.cudosnode.marketplace.MsgPublishCollection.prototype.getCreator = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.cudoventures.cudosnode.marketplace.MsgPublishCollection} returns this
 */
proto.cudoventures.cudosnode.marketplace.MsgPublishCollection.prototype.setCreator = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string denomId = 2;
 * @return {string}
 */
proto.cudoventures.cudosnode.marketplace.MsgPublishCollection.prototype.getDenomid = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.cudoventures.cudosnode.marketplace.MsgPublishCollection} returns this
 */
proto.cudoventures.cudosnode.marketplace.MsgPublishCollection.prototype.setDenomid = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * repeated Royalty mintRoyalties = 3;
 * @return {!Array<!proto.cudoventures.cudosnode.marketplace.Royalty>}
 */
proto.cudoventures.cudosnode.marketplace.MsgPublishCollection.prototype.getMintroyaltiesList = function() {
  return /** @type{!Array<!proto.cudoventures.cudosnode.marketplace.Royalty>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cudoventures.cudosnode.marketplace.Royalty, 3));
};


/**
 * @param {!Array<!proto.cudoventures.cudosnode.marketplace.Royalty>} value
 * @return {!proto.cudoventures.cudosnode.marketplace.MsgPublishCollection} returns this
*/
proto.cudoventures.cudosnode.marketplace.MsgPublishCollection.prototype.setMintroyaltiesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 3, value);
};


/**
 * @param {!proto.cudoventures.cudosnode.marketplace.Royalty=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cudoventures.cudosnode.marketplace.Royalty}
 */
proto.cudoventures.cudosnode.marketplace.MsgPublishCollection.prototype.addMintroyalties = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 3, opt_value, proto.cudoventures.cudosnode.marketplace.Royalty, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cudoventures.cudosnode.marketplace.MsgPublishCollection} returns this
 */
proto.cudoventures.cudosnode.marketplace.MsgPublishCollection.prototype.clearMintroyaltiesList = function() {
  return this.setMintroyaltiesList([]);
};


/**
 * repeated Royalty resaleRoyalties = 4;
 * @return {!Array<!proto.cudoventures.cudosnode.marketplace.Royalty>}
 */
proto.cudoventures.cudosnode.marketplace.MsgPublishCollection.prototype.getResaleroyaltiesList = function() {
  return /** @type{!Array<!proto.cudoventures.cudosnode.marketplace.Royalty>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cudoventures.cudosnode.marketplace.Royalty, 4));
};


/**
 * @param {!Array<!proto.cudoventures.cudosnode.marketplace.Royalty>} value
 * @return {!proto.cudoventures.cudosnode.marketplace.MsgPublishCollection} returns this
*/
proto.cudoventures.cudosnode.marketplace.MsgPublishCollection.prototype.setResaleroyaltiesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 4, value);
};


/**
 * @param {!proto.cudoventures.cudosnode.marketplace.Royalty=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cudoventures.cudosnode.marketplace.Royalty}
 */
proto.cudoventures.cudosnode.marketplace.MsgPublishCollection.prototype.addResaleroyalties = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 4, opt_value, proto.cudoventures.cudosnode.marketplace.Royalty, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cudoventures.cudosnode.marketplace.MsgPublishCollection} returns this
 */
proto.cudoventures.cudosnode.marketplace.MsgPublishCollection.prototype.clearResaleroyaltiesList = function() {
  return this.setResaleroyaltiesList([]);
};


