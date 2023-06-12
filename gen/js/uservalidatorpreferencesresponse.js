// source: osmosis/valset-pref/v1beta1/query.proto
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

goog.provide('proto.osmosis.valsetpref.v1beta1.UserValidatorPreferencesResponse');

goog.require('jspb.BinaryReader');
goog.require('jspb.BinaryWriter');
goog.require('jspb.Message');
goog.require('proto.osmosis.valsetpref.v1beta1.ValidatorPreference');

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
proto.osmosis.valsetpref.v1beta1.UserValidatorPreferencesResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.osmosis.valsetpref.v1beta1.UserValidatorPreferencesResponse.repeatedFields_, null);
};
goog.inherits(proto.osmosis.valsetpref.v1beta1.UserValidatorPreferencesResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.osmosis.valsetpref.v1beta1.UserValidatorPreferencesResponse.displayName = 'proto.osmosis.valsetpref.v1beta1.UserValidatorPreferencesResponse';
}

/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.osmosis.valsetpref.v1beta1.UserValidatorPreferencesResponse.repeatedFields_ = [1];



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
proto.osmosis.valsetpref.v1beta1.UserValidatorPreferencesResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.osmosis.valsetpref.v1beta1.UserValidatorPreferencesResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.osmosis.valsetpref.v1beta1.UserValidatorPreferencesResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.valsetpref.v1beta1.UserValidatorPreferencesResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    preferencesList: jspb.Message.toObjectList(msg.getPreferencesList(),
    proto.osmosis.valsetpref.v1beta1.ValidatorPreference.toObject, includeInstance)
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
 * @return {!proto.osmosis.valsetpref.v1beta1.UserValidatorPreferencesResponse}
 */
proto.osmosis.valsetpref.v1beta1.UserValidatorPreferencesResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.osmosis.valsetpref.v1beta1.UserValidatorPreferencesResponse;
  return proto.osmosis.valsetpref.v1beta1.UserValidatorPreferencesResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.osmosis.valsetpref.v1beta1.UserValidatorPreferencesResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.osmosis.valsetpref.v1beta1.UserValidatorPreferencesResponse}
 */
proto.osmosis.valsetpref.v1beta1.UserValidatorPreferencesResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.osmosis.valsetpref.v1beta1.ValidatorPreference;
      reader.readMessage(value,proto.osmosis.valsetpref.v1beta1.ValidatorPreference.deserializeBinaryFromReader);
      msg.addPreferences(value);
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
proto.osmosis.valsetpref.v1beta1.UserValidatorPreferencesResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.osmosis.valsetpref.v1beta1.UserValidatorPreferencesResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.osmosis.valsetpref.v1beta1.UserValidatorPreferencesResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.osmosis.valsetpref.v1beta1.UserValidatorPreferencesResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getPreferencesList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.osmosis.valsetpref.v1beta1.ValidatorPreference.serializeBinaryToWriter
    );
  }
};


/**
 * repeated ValidatorPreference preferences = 1;
 * @return {!Array<!proto.osmosis.valsetpref.v1beta1.ValidatorPreference>}
 */
proto.osmosis.valsetpref.v1beta1.UserValidatorPreferencesResponse.prototype.getPreferencesList = function() {
  return /** @type{!Array<!proto.osmosis.valsetpref.v1beta1.ValidatorPreference>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.osmosis.valsetpref.v1beta1.ValidatorPreference, 1));
};


/**
 * @param {!Array<!proto.osmosis.valsetpref.v1beta1.ValidatorPreference>} value
 * @return {!proto.osmosis.valsetpref.v1beta1.UserValidatorPreferencesResponse} returns this
*/
proto.osmosis.valsetpref.v1beta1.UserValidatorPreferencesResponse.prototype.setPreferencesList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.osmosis.valsetpref.v1beta1.ValidatorPreference=} opt_value
 * @param {number=} opt_index
 * @return {!proto.osmosis.valsetpref.v1beta1.ValidatorPreference}
 */
proto.osmosis.valsetpref.v1beta1.UserValidatorPreferencesResponse.prototype.addPreferences = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.osmosis.valsetpref.v1beta1.ValidatorPreference, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.osmosis.valsetpref.v1beta1.UserValidatorPreferencesResponse} returns this
 */
proto.osmosis.valsetpref.v1beta1.UserValidatorPreferencesResponse.prototype.clearPreferencesList = function() {
  return this.setPreferencesList([]);
};


