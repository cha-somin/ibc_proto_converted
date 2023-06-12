// source: likechain/likenft/v1/query.proto
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

goog.provide('proto.likechain.likenft.v1.QueryClassesByAccountResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.query.v1beta1.PageResponse');
goog.require('proto.cosmos.nft.v1beta1.Class');

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
proto.likechain.likenft.v1.QueryClassesByAccountResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.likechain.likenft.v1.QueryClassesByAccountResponse.repeatedFields_, null);
};
goog.inherits(proto.likechain.likenft.v1.QueryClassesByAccountResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.likechain.likenft.v1.QueryClassesByAccountResponse.displayName = 'proto.likechain.likenft.v1.QueryClassesByAccountResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.likechain.likenft.v1.QueryClassesByAccountResponse.repeatedFields_ = [2];



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
proto.likechain.likenft.v1.QueryClassesByAccountResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.likechain.likenft.v1.QueryClassesByAccountResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.likechain.likenft.v1.QueryClassesByAccountResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.likechain.likenft.v1.QueryClassesByAccountResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    account: jspb.Message.getFieldWithDefault(msg, 1, ""),
    classesList: jspb.Message.toObjectList(msg.getClassesList(),
    proto.cosmos.nft.v1beta1.Class.toObject, includeInstance),
    pagination: (f = msg.getPagination()) && proto.cosmos.base.query.v1beta1.PageResponse.toObject(includeInstance, f)
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
 * @return {!proto.likechain.likenft.v1.QueryClassesByAccountResponse}
 */
proto.likechain.likenft.v1.QueryClassesByAccountResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.likechain.likenft.v1.QueryClassesByAccountResponse;
  return proto.likechain.likenft.v1.QueryClassesByAccountResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.likechain.likenft.v1.QueryClassesByAccountResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.likechain.likenft.v1.QueryClassesByAccountResponse}
 */
proto.likechain.likenft.v1.QueryClassesByAccountResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setAccount(value);
      break;
    case 2:
      var value = new proto.cosmos.nft.v1beta1.Class;
      reader.readMessage(value,proto.cosmos.nft.v1beta1.Class.deserializeBinaryFromReader);
      msg.addClasses(value);
      break;
    case 3:
      var value = new proto.cosmos.base.query.v1beta1.PageResponse;
      reader.readMessage(value,proto.cosmos.base.query.v1beta1.PageResponse.deserializeBinaryFromReader);
      msg.setPagination(value);
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
proto.likechain.likenft.v1.QueryClassesByAccountResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.likechain.likenft.v1.QueryClassesByAccountResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.likechain.likenft.v1.QueryClassesByAccountResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.likechain.likenft.v1.QueryClassesByAccountResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAccount();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getClassesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.cosmos.nft.v1beta1.Class.serializeBinaryToWriter
    );
  }
  f = message.getPagination();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.cosmos.base.query.v1beta1.PageResponse.serializeBinaryToWriter
    );
  }
};


/**
 * optional string account = 1;
 * @return {string}
 */
proto.likechain.likenft.v1.QueryClassesByAccountResponse.prototype.getAccount = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.likechain.likenft.v1.QueryClassesByAccountResponse} returns this
 */
proto.likechain.likenft.v1.QueryClassesByAccountResponse.prototype.setAccount = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated cosmos.nft.v1beta1.Class classes = 2;
 * @return {!Array<!proto.cosmos.nft.v1beta1.Class>}
 */
proto.likechain.likenft.v1.QueryClassesByAccountResponse.prototype.getClassesList = function() {
  return /** @type{!Array<!proto.cosmos.nft.v1beta1.Class>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.nft.v1beta1.Class, 2));
};


/**
 * @param {!Array<!proto.cosmos.nft.v1beta1.Class>} value
 * @return {!proto.likechain.likenft.v1.QueryClassesByAccountResponse} returns this
*/
proto.likechain.likenft.v1.QueryClassesByAccountResponse.prototype.setClassesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.cosmos.nft.v1beta1.Class=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.nft.v1beta1.Class}
 */
proto.likechain.likenft.v1.QueryClassesByAccountResponse.prototype.addClasses = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.cosmos.nft.v1beta1.Class, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.likechain.likenft.v1.QueryClassesByAccountResponse} returns this
 */
proto.likechain.likenft.v1.QueryClassesByAccountResponse.prototype.clearClassesList = function() {
  return this.setClassesList([]);
};


/**
 * optional cosmos.base.query.v1beta1.PageResponse pagination = 3;
 * @return {?proto.cosmos.base.query.v1beta1.PageResponse}
 */
proto.likechain.likenft.v1.QueryClassesByAccountResponse.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageResponse} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageResponse, 3));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageResponse|undefined} value
 * @return {!proto.likechain.likenft.v1.QueryClassesByAccountResponse} returns this
*/
proto.likechain.likenft.v1.QueryClassesByAccountResponse.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.likechain.likenft.v1.QueryClassesByAccountResponse} returns this
 */
proto.likechain.likenft.v1.QueryClassesByAccountResponse.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.likechain.likenft.v1.QueryClassesByAccountResponse.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 3) != null;
};


