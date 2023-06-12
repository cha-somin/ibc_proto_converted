// source: coreum/asset/nft/v1/query.proto
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

goog.provide('proto.coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.query.v1beta1.PageResponse');

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
proto.coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse.repeatedFields_, null);
};
goog.inherits(proto.coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse.displayName = 'proto.coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse.repeatedFields_ = [2];



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
proto.coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    pagination: (f = msg.getPagination()) && proto.cosmos.base.query.v1beta1.PageResponse.toObject(includeInstance, f),
    accountsList: (f = jspb.Message.getRepeatedField(msg, 2)) == null ? undefined : f
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
 * @return {!proto.coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse}
 */
proto.coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse;
  return proto.coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse}
 */
proto.coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.cosmos.base.query.v1beta1.PageResponse;
      reader.readMessage(value,proto.cosmos.base.query.v1beta1.PageResponse.deserializeBinaryFromReader);
      msg.setPagination(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.addAccounts(value);
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
proto.coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPagination();
  if (f != null) {
    writer.writeMessage(
      1,
      f,
      proto.cosmos.base.query.v1beta1.PageResponse.serializeBinaryToWriter
    );
  }
  f = message.getAccountsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      2,
      f
    );
  }
};


/**
 * optional cosmos.base.query.v1beta1.PageResponse pagination = 1;
 * @return {?proto.cosmos.base.query.v1beta1.PageResponse}
 */
proto.coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageResponse} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageResponse, 1));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageResponse|undefined} value
 * @return {!proto.coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse} returns this
*/
proto.coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 1, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse} returns this
 */
proto.coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 1) != null;
};


/**
 * repeated string accounts = 2;
 * @return {!Array<string>}
 */
proto.coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse.prototype.getAccountsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 2));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse} returns this
 */
proto.coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse.prototype.setAccountsList = function(value) {
  return jspb.Message.setField(this, 2, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse} returns this
 */
proto.coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse.prototype.addAccounts = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 2, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse} returns this
 */
proto.coreum.asset.nft.v1.QueryWhitelistedAccountsForNFTResponse.prototype.clearAccountsList = function() {
  return this.setAccountsList([]);
};


