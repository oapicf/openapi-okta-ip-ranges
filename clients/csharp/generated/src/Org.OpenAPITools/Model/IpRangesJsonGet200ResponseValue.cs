// <auto-generated>
/*
 * OpenAPI Okta IP Ranges
 *
 * OpenAPI specification and a set of generated API clients for Okta IP Ranges
 *
 * The version of the OpenAPI document: 1.0.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

#nullable enable

using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Text.Json;
using System.Text.Json.Serialization;
using System.ComponentModel.DataAnnotations;
using Org.OpenAPITools.Client;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Object containing IP ranges for a specific regional cell
    /// </summary>
    public partial class IpRangesJsonGet200ResponseValue : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="IpRangesJsonGet200ResponseValue" /> class.
        /// </summary>
        /// <param name="ipRanges">ipRanges</param>
        [JsonConstructor]
        public IpRangesJsonGet200ResponseValue(Option<List<string>?> ipRanges = default)
        {
            IpRangesOption = ipRanges;
            OnCreated();
        }

        partial void OnCreated();

        /// <summary>
        /// Used to track the state of IpRanges
        /// </summary>
        [JsonIgnore]
        [global::System.ComponentModel.EditorBrowsable(global::System.ComponentModel.EditorBrowsableState.Never)]
        public Option<List<string>?> IpRangesOption { get; private set; }

        /// <summary>
        /// Gets or Sets IpRanges
        /// </summary>
        [JsonPropertyName("ip_ranges")]
        public List<string>? IpRanges { get { return this.IpRangesOption; } set { this.IpRangesOption = new(value); } }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class IpRangesJsonGet200ResponseValue {\n");
            sb.Append("  IpRanges: ").Append(IpRanges).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

    /// <summary>
    /// A Json converter for type <see cref="IpRangesJsonGet200ResponseValue" />
    /// </summary>
    public class IpRangesJsonGet200ResponseValueJsonConverter : JsonConverter<IpRangesJsonGet200ResponseValue>
    {
        /// <summary>
        /// Deserializes json to <see cref="IpRangesJsonGet200ResponseValue" />
        /// </summary>
        /// <param name="utf8JsonReader"></param>
        /// <param name="typeToConvert"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <returns></returns>
        /// <exception cref="JsonException"></exception>
        public override IpRangesJsonGet200ResponseValue Read(ref Utf8JsonReader utf8JsonReader, Type typeToConvert, JsonSerializerOptions jsonSerializerOptions)
        {
            int currentDepth = utf8JsonReader.CurrentDepth;

            if (utf8JsonReader.TokenType != JsonTokenType.StartObject && utf8JsonReader.TokenType != JsonTokenType.StartArray)
                throw new JsonException();

            JsonTokenType startingTokenType = utf8JsonReader.TokenType;

            Option<List<string>?> ipRanges = default;

            while (utf8JsonReader.Read())
            {
                if (startingTokenType == JsonTokenType.StartObject && utf8JsonReader.TokenType == JsonTokenType.EndObject && currentDepth == utf8JsonReader.CurrentDepth)
                    break;

                if (startingTokenType == JsonTokenType.StartArray && utf8JsonReader.TokenType == JsonTokenType.EndArray && currentDepth == utf8JsonReader.CurrentDepth)
                    break;

                if (utf8JsonReader.TokenType == JsonTokenType.PropertyName && currentDepth == utf8JsonReader.CurrentDepth - 1)
                {
                    string? localVarJsonPropertyName = utf8JsonReader.GetString();
                    utf8JsonReader.Read();

                    switch (localVarJsonPropertyName)
                    {
                        case "ip_ranges":
                            if (utf8JsonReader.TokenType != JsonTokenType.Null)
                                ipRanges = new Option<List<string>?>(JsonSerializer.Deserialize<List<string>>(ref utf8JsonReader, jsonSerializerOptions)!);
                            break;
                        default:
                            break;
                    }
                }
            }

            if (ipRanges.IsSet && ipRanges.Value == null)
                throw new ArgumentNullException(nameof(ipRanges), "Property is not nullable for class IpRangesJsonGet200ResponseValue.");

            return new IpRangesJsonGet200ResponseValue(ipRanges);
        }

        /// <summary>
        /// Serializes a <see cref="IpRangesJsonGet200ResponseValue" />
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="ipRangesJsonGet200ResponseValue"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <exception cref="NotImplementedException"></exception>
        public override void Write(Utf8JsonWriter writer, IpRangesJsonGet200ResponseValue ipRangesJsonGet200ResponseValue, JsonSerializerOptions jsonSerializerOptions)
        {
            writer.WriteStartObject();

            WriteProperties(writer, ipRangesJsonGet200ResponseValue, jsonSerializerOptions);
            writer.WriteEndObject();
        }

        /// <summary>
        /// Serializes the properties of <see cref="IpRangesJsonGet200ResponseValue" />
        /// </summary>
        /// <param name="writer"></param>
        /// <param name="ipRangesJsonGet200ResponseValue"></param>
        /// <param name="jsonSerializerOptions"></param>
        /// <exception cref="NotImplementedException"></exception>
        public void WriteProperties(Utf8JsonWriter writer, IpRangesJsonGet200ResponseValue ipRangesJsonGet200ResponseValue, JsonSerializerOptions jsonSerializerOptions)
        {
            if (ipRangesJsonGet200ResponseValue.IpRangesOption.IsSet && ipRangesJsonGet200ResponseValue.IpRanges == null)
                throw new ArgumentNullException(nameof(ipRangesJsonGet200ResponseValue.IpRanges), "Property is required for class IpRangesJsonGet200ResponseValue.");

            if (ipRangesJsonGet200ResponseValue.IpRangesOption.IsSet)
            {
                writer.WritePropertyName("ip_ranges");
                JsonSerializer.Serialize(writer, ipRangesJsonGet200ResponseValue.IpRanges, jsonSerializerOptions);
            }
        }
    }
}
