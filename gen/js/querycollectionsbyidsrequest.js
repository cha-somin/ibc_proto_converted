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

goog.provide('proto.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest');

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
proto.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest.repeatedFields_, null);
};
goog.inherits(proto.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest.displayName = 'proto.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest.repeatedFields_ = [1];



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
proto.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    denomIdsList: (f = jspb.Message.getRepeatedField(msg, 1)) == null ? undefined : f
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
 * @return {!proto.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest}
 */
proto.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest;
  return proto.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest}
 */
proto.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.addDenomIds(value);
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
proto.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getDenomIdsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      1,
      f
    );
  }
};


/**
 * repeated string denom_ids = 1;
 * @return {!Array<string>}
 */
proto.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest.prototype.getDenomIdsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 1));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest} returns this
 */
proto.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest.prototype.setDenomIdsList = function(value) {
  return jspb.Message.setField(this, 1, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest} returns this
 */
proto.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest.prototype.addDenomIds = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 1, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest} returns this
 */
proto.cudosnode.cudosnode.nft.QueryCollectionsByIdsRequest.prototype.clearDenomIdsList = function() {
  return this.setDenomIdsList([]);
};


