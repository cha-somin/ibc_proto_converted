// source: desmos/profiles/v3/query_chain_links.proto
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

goog.provide('proto.desmos.profiles.v3.QueryChainLinksResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.cosmos.base.query.v1beta1.PageResponse');
goog.require('proto.desmos.profiles.v3.ChainLink');

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
proto.desmos.profiles.v3.QueryChainLinksResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.desmos.profiles.v3.QueryChainLinksResponse.repeatedFields_, null);
};
goog.inherits(proto.desmos.profiles.v3.QueryChainLinksResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.desmos.profiles.v3.QueryChainLinksResponse.displayName = 'proto.desmos.profiles.v3.QueryChainLinksResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.desmos.profiles.v3.QueryChainLinksResponse.repeatedFields_ = [1];



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
proto.desmos.profiles.v3.QueryChainLinksResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.desmos.profiles.v3.QueryChainLinksResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.desmos.profiles.v3.QueryChainLinksResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.profiles.v3.QueryChainLinksResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    linksList: jspb.Message.toObjectList(msg.getLinksList(),
    proto.desmos.profiles.v3.ChainLink.toObject, includeInstance),
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
 * @return {!proto.desmos.profiles.v3.QueryChainLinksResponse}
 */
proto.desmos.profiles.v3.QueryChainLinksResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.desmos.profiles.v3.QueryChainLinksResponse;
  return proto.desmos.profiles.v3.QueryChainLinksResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.desmos.profiles.v3.QueryChainLinksResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.desmos.profiles.v3.QueryChainLinksResponse}
 */
proto.desmos.profiles.v3.QueryChainLinksResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.desmos.profiles.v3.ChainLink;
      reader.readMessage(value,proto.desmos.profiles.v3.ChainLink.deserializeBinaryFromReader);
      msg.addLinks(value);
      break;
    case 2:
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
proto.desmos.profiles.v3.QueryChainLinksResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.desmos.profiles.v3.QueryChainLinksResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.desmos.profiles.v3.QueryChainLinksResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.desmos.profiles.v3.QueryChainLinksResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getLinksList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.desmos.profiles.v3.ChainLink.serializeBinaryToWriter
    );
  }
  f = message.getPagination();
  if (f != null) {
    writer.writeMessage(
      2,
      f,
      proto.cosmos.base.query.v1beta1.PageResponse.serializeBinaryToWriter
    );
  }
};


/**
 * repeated ChainLink links = 1;
 * @return {!Array<!proto.desmos.profiles.v3.ChainLink>}
 */
proto.desmos.profiles.v3.QueryChainLinksResponse.prototype.getLinksList = function() {
  return /** @type{!Array<!proto.desmos.profiles.v3.ChainLink>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.desmos.profiles.v3.ChainLink, 1));
};


/**
 * @param {!Array<!proto.desmos.profiles.v3.ChainLink>} value
 * @return {!proto.desmos.profiles.v3.QueryChainLinksResponse} returns this
*/
proto.desmos.profiles.v3.QueryChainLinksResponse.prototype.setLinksList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.desmos.profiles.v3.ChainLink=} opt_value
 * @param {number=} opt_index
 * @return {!proto.desmos.profiles.v3.ChainLink}
 */
proto.desmos.profiles.v3.QueryChainLinksResponse.prototype.addLinks = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.desmos.profiles.v3.ChainLink, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.desmos.profiles.v3.QueryChainLinksResponse} returns this
 */
proto.desmos.profiles.v3.QueryChainLinksResponse.prototype.clearLinksList = function() {
  return this.setLinksList([]);
};


/**
 * optional cosmos.base.query.v1beta1.PageResponse pagination = 2;
 * @return {?proto.cosmos.base.query.v1beta1.PageResponse}
 */
proto.desmos.profiles.v3.QueryChainLinksResponse.prototype.getPagination = function() {
  return /** @type{?proto.cosmos.base.query.v1beta1.PageResponse} */ (
    jspb.Message.getWrapperField(this, proto.cosmos.base.query.v1beta1.PageResponse, 2));
};


/**
 * @param {?proto.cosmos.base.query.v1beta1.PageResponse|undefined} value
 * @return {!proto.desmos.profiles.v3.QueryChainLinksResponse} returns this
*/
proto.desmos.profiles.v3.QueryChainLinksResponse.prototype.setPagination = function(value) {
  return jspb.Message.setWrapperField(this, 2, value);
};


/**
 * Clears the message field making it undefined.
 * @return {!proto.desmos.profiles.v3.QueryChainLinksResponse} returns this
 */
proto.desmos.profiles.v3.QueryChainLinksResponse.prototype.clearPagination = function() {
  return this.setPagination(undefined);
};


/**
 * Returns whether this field is set.
 * @return {boolean}
 */
proto.desmos.profiles.v3.QueryChainLinksResponse.prototype.hasPagination = function() {
  return jspb.Message.getField(this, 2) != null;
};


