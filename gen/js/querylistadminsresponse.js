// source: cudos/marketplace/query.proto
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

goog.provide('proto.cudoventures.cudosnode.marketplace.QueryListAdminsResponse');

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
proto.cudoventures.cudosnode.marketplace.QueryListAdminsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.cudoventures.cudosnode.marketplace.QueryListAdminsResponse.repeatedFields_, null);
};
goog.inherits(proto.cudoventures.cudosnode.marketplace.QueryListAdminsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.cudoventures.cudosnode.marketplace.QueryListAdminsResponse.displayName = 'proto.cudoventures.cudosnode.marketplace.QueryListAdminsResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.cudoventures.cudosnode.marketplace.QueryListAdminsResponse.repeatedFields_ = [1];



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
proto.cudoventures.cudosnode.marketplace.QueryListAdminsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.cudoventures.cudosnode.marketplace.QueryListAdminsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.cudoventures.cudosnode.marketplace.QueryListAdminsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cudoventures.cudosnode.marketplace.QueryListAdminsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    adminsList: (f = jspb.Message.getRepeatedField(msg, 1)) == null ? undefined : f
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
 * @return {!proto.cudoventures.cudosnode.marketplace.QueryListAdminsResponse}
 */
proto.cudoventures.cudosnode.marketplace.QueryListAdminsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.cudoventures.cudosnode.marketplace.QueryListAdminsResponse;
  return proto.cudoventures.cudosnode.marketplace.QueryListAdminsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.cudoventures.cudosnode.marketplace.QueryListAdminsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.cudoventures.cudosnode.marketplace.QueryListAdminsResponse}
 */
proto.cudoventures.cudosnode.marketplace.QueryListAdminsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.addAdmins(value);
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
proto.cudoventures.cudosnode.marketplace.QueryListAdminsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.cudoventures.cudosnode.marketplace.QueryListAdminsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.cudoventures.cudosnode.marketplace.QueryListAdminsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.cudoventures.cudosnode.marketplace.QueryListAdminsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getAdminsList();
  if (f.length > 0) {
    writer.writeRepeatedString(
      1,
      f
    );
  }
};


/**
 * repeated string Admins = 1;
 * @return {!Array<string>}
 */
proto.cudoventures.cudosnode.marketplace.QueryListAdminsResponse.prototype.getAdminsList = function() {
  return /** @type {!Array<string>} */ (jspb.Message.getRepeatedField(this, 1));
};


/**
 * @param {!Array<string>} value
 * @return {!proto.cudoventures.cudosnode.marketplace.QueryListAdminsResponse} returns this
 */
proto.cudoventures.cudosnode.marketplace.QueryListAdminsResponse.prototype.setAdminsList = function(value) {
  return jspb.Message.setField(this, 1, value || []);
};


/**
 * @param {string} value
 * @param {number=} opt_index
 * @return {!proto.cudoventures.cudosnode.marketplace.QueryListAdminsResponse} returns this
 */
proto.cudoventures.cudosnode.marketplace.QueryListAdminsResponse.prototype.addAdmins = function(value, opt_index) {
  return jspb.Message.addToRepeatedField(this, 1, value, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.cudoventures.cudosnode.marketplace.QueryListAdminsResponse} returns this
 */
proto.cudoventures.cudosnode.marketplace.QueryListAdminsResponse.prototype.clearAdminsList = function() {
  return this.setAdminsList([]);
};


