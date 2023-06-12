// source: cosmos/nft/v1beta1/genesis.proto
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

goog.provide('proto.cosmos.nft.v1beta1.Entry');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.nft.v1beta1.NFT');

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
proto.cosmos.nft.v1beta1.Entry = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cosmos.nft.v1beta1.Entry.repeatedFields_, null);
};
goog.inherits(proto.cosmos.nft.v1beta1.Entry, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cosmos.nft.v1beta1.Entry.displayName = 'proto.cosmos.nft.v1beta1.Entry';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cosmos.nft.v1beta1.Entry.repeatedFields_ = [2];



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
proto.cosmos.nft.v1beta1.Entry.prototype.toObject = function(opt_includeInstance) {
  return proto.cosmos.nft.v1beta1.Entry.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cosmos.nft.v1beta1.Entry} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.nft.v1beta1.Entry.toObject = function(includeInstance, msg) {
  var f, obj = {
    owner: jspb.Message.getFieldWithDefault(msg, 1, ""),
    nftsList: jspb.Message.toObjectList(msg.getNftsList(),
    proto.cosmos.nft.v1beta1.NFT.toObject, includeInstance)
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
 * @return {!proto.cosmos.nft.v1beta1.Entry}
 */
proto.cosmos.nft.v1beta1.Entry.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cosmos.nft.v1beta1.Entry;
  return proto.cosmos.nft.v1beta1.Entry.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cosmos.nft.v1beta1.Entry} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cosmos.nft.v1beta1.Entry}
 */
proto.cosmos.nft.v1beta1.Entry.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setOwner(value);
      break;
    case 2:
      var value = new proto.cosmos.nft.v1beta1.NFT;
      reader.readMessage(value,proto.cosmos.nft.v1beta1.NFT.deserializeBinaryFromReader);
      msg.addNfts(value);
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
proto.cosmos.nft.v1beta1.Entry.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cosmos.nft.v1beta1.Entry.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cosmos.nft.v1beta1.Entry} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cosmos.nft.v1beta1.Entry.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getOwner();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getNftsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      2,
      f,
      proto.cosmos.nft.v1beta1.NFT.serializeBinaryToWriter
    );
  }
};


/**
 * optional string owner = 1;
 * @return {string}
 */
proto.cosmos.nft.v1beta1.Entry.prototype.getOwner = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.cosmos.nft.v1beta1.Entry} returns this
 */
proto.cosmos.nft.v1beta1.Entry.prototype.setOwner = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * repeated NFT nfts = 2;
 * @return {!Array<!proto.cosmos.nft.v1beta1.NFT>}
 */
proto.cosmos.nft.v1beta1.Entry.prototype.getNftsList = function() {
  return /** @type{!Array<!proto.cosmos.nft.v1beta1.NFT>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.cosmos.nft.v1beta1.NFT, 2));
};


/**
 * @param {!Array<!proto.cosmos.nft.v1beta1.NFT>} value
 * @return {!proto.cosmos.nft.v1beta1.Entry} returns this
*/
proto.cosmos.nft.v1beta1.Entry.prototype.setNftsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 2, value);
};


/**
 * @param {!proto.cosmos.nft.v1beta1.NFT=} opt_value
 * @param {number=} opt_index
 * @return {!proto.cosmos.nft.v1beta1.NFT}
 */
proto.cosmos.nft.v1beta1.Entry.prototype.addNfts = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 2, opt_value, proto.cosmos.nft.v1beta1.NFT, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cosmos.nft.v1beta1.Entry} returns this
 */
proto.cosmos.nft.v1beta1.Entry.prototype.clearNftsList = function() {
  return this.setNftsList([]);
};


