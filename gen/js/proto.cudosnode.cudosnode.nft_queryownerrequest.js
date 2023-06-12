// source: cudos/nft/query.proto
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

goog.provide('proto.cudosnode.cudosnode.nft.QueryOwnerRequest');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.query.v1beta1.PageRequest');

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
proto.cudosnode.cudosnode.nft.QueryOwnerRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.cudosnode.cudosnode.nft.QueryOwnerRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cudosnode.cudosnode.nft.QueryOwnerRequest.displayName = 'proto.cudosnode.cudosnode.nft.QueryOwnerRequest';
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
proto.cudosnode.cudosnode.nft.QueryOwnerRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.cudosnode.cudosnode.nft.QueryOwnerRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cudosnode.cudosnode.nft.QueryOwnerRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cudosnode.cudosnode.nft.QueryOwnerRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    denomId: jspb.Message.getFieldWithDefault(msg, 1, ""),
    owner: jspb.Message.getFieldWithDefault(msg, 2, ""),
    pagination: (f = msg.getPagination()) && proto.cosmos.base.query.v1beta1.PageRequest.toObject(includeInstance, f)
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
 * @return {!proto.cudosnode.cudosnode.nft.QueryOwnerRequest}
 */
proto.cudosnode.cudosnode.nft.QueryOwnerRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cudosnode.cudosnode.nft.QueryOwnerRequest;
  return proto.cudosnode.cudosnode.nft.QueryOwnerRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cudosnode.cudosnode.nft.QueryOwnerRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cudosnode.cudosnode.nft.QueryOwnerRequest}
 */
proto.cudosnode.cudosnode.nft.QueryOwnerRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setDenomId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setOwner(value);
      break;
    case 3:
      var value = new proto.cosmos.base.query.v1beta1.PageRequest;
      reader.readMessage(value,proto.cosmos.base.query.v1beta1.PageRequest.deserializeBinaryFromReader);
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
proto.cudosnode.cudosnode.nft.QueryOwnerRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cudosnode.cudosnode.nft.QueryOwnerRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cudosnode.cudosnode.nft.QueryOwnerRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cudosnode.cudosnode.nft.QueryOwnerRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDenomId();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getOwner();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getPagination();
  if (f != null) {
    writer.writeMessage(
      3,
      f,
      proto.cosmos.base.query.v1beta1.PageRequest.serializeBinaryToWriter
    );
  }
};


/**
 * optional string denom_id = 1;
 * @return {string}
 */
proto.cudosnode.cudosnode.nft.QueryOwnerRequest.prototype.getDenomId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.cudosnode.cudosnode.nft.QueryOwnerRequest} returns this
 */
proto.cudosnode.cudosnode.nft.QueryOwnerRequest.prototype.setDenomId = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string owner = 2;
 * @return {string}
 */
proto.cudosnode.cudosnode.nft.QueryOwnerRequest.prototype.getOwner = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.cudosnode.cudosnode.nft.QueryOwnerRequest} returns this
 */
proto.cudosnode.cudosnode.nft.QueryOwnerRequest.prototype.setOwner = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional cosmos.base.query.v1beta1.PageRequest pagination = 3;
 * @return {?proto.cosmos.base.query.v1beta1.PageRequest}
 */
proto.cudosnode.cudosnode.nft.QueryOwnerRequest.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageRequest} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageRequest, 3));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageRequest|undefined} value
 * @return {!proto.cudosnode.cudosnode.nft.QueryOwnerRequest} returns this
*/
proto.cudosnode.cudosnode.nft.QueryOwnerRequest.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 3, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.cudosnode.cudosnode.nft.QueryOwnerRequest} returns this
 */
proto.cudosnode.cudosnode.nft.QueryOwnerRequest.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.cudosnode.cudosnode.nft.QueryOwnerRequest.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 3) != null;
};


