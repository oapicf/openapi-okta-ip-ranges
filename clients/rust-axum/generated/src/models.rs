#![allow(unused_qualifications)]

use http::HeaderValue;
use validator::Validate;

#[cfg(feature = "server")]
use crate::header;
use crate::{models, types::*};

      


/// Object containing IP ranges for a specific regional cell
#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize, validator::Validate)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct IpRangesJsonGet200ResponseValue {
    #[serde(rename = "ip_ranges")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub ip_ranges: Option<Vec<String>>,

}





impl IpRangesJsonGet200ResponseValue {
    #[allow(clippy::new_without_default, clippy::too_many_arguments)]
    pub fn new() -> IpRangesJsonGet200ResponseValue {
        IpRangesJsonGet200ResponseValue {
            ip_ranges: None,
        }
    }
}

/// Converts the IpRangesJsonGet200ResponseValue value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::fmt::Display for IpRangesJsonGet200ResponseValue {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let params: Vec<Option<String>> = vec![

            self.ip_ranges.as_ref().map(|ip_ranges| {
                [
                    "ip_ranges".to_string(),
                    ip_ranges.iter().map(|x| x.to_string()).collect::<Vec<_>>().join(","),
                ].join(",")
            }),

        ];

        write!(f, "{}", params.into_iter().flatten().collect::<Vec<_>>().join(","))
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a IpRangesJsonGet200ResponseValue value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for IpRangesJsonGet200ResponseValue {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub ip_ranges: Vec<Vec<String>>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing IpRangesJsonGet200ResponseValue".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    "ip_ranges" => return std::result::Result::Err("Parsing a container in this style is not supported in IpRangesJsonGet200ResponseValue".to_string()),
                    _ => return std::result::Result::Err("Unexpected key while parsing IpRangesJsonGet200ResponseValue".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(IpRangesJsonGet200ResponseValue {
            ip_ranges: intermediate_rep.ip_ranges.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<IpRangesJsonGet200ResponseValue> and HeaderValue

#[cfg(feature = "server")]
impl std::convert::TryFrom<header::IntoHeaderValue<IpRangesJsonGet200ResponseValue>> for HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<IpRangesJsonGet200ResponseValue>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for IpRangesJsonGet200ResponseValue - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(feature = "server")]
impl std::convert::TryFrom<HeaderValue> for header::IntoHeaderValue<IpRangesJsonGet200ResponseValue> {
    type Error = String;

    fn try_from(hdr_value: HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <IpRangesJsonGet200ResponseValue as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into IpRangesJsonGet200ResponseValue - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}



