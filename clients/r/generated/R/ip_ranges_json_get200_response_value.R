#' Create a new IpRangesJsonGet200ResponseValue
#'
#' @description
#' Object containing IP ranges for a specific regional cell
#'
#' @docType class
#' @title IpRangesJsonGet200ResponseValue
#' @description IpRangesJsonGet200ResponseValue Class
#' @format An \code{R6Class} generator object
#' @field ip_ranges  list(character) [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
IpRangesJsonGet200ResponseValue <- R6::R6Class(
  "IpRangesJsonGet200ResponseValue",
  public = list(
    `ip_ranges` = NULL,

    #' @description
    #' Initialize a new IpRangesJsonGet200ResponseValue class.
    #'
    #' @param ip_ranges ip_ranges
    #' @param ... Other optional arguments.
    initialize = function(`ip_ranges` = NULL, ...) {
      if (!is.null(`ip_ranges`)) {
        stopifnot(is.vector(`ip_ranges`), length(`ip_ranges`) != 0)
        sapply(`ip_ranges`, function(x) stopifnot(is.character(x)))
        self$`ip_ranges` <- `ip_ranges`
      }
    },

    #' @description
    #' To JSON String
    #'
    #' @return IpRangesJsonGet200ResponseValue in JSON format
    toJSON = function() {
      IpRangesJsonGet200ResponseValueObject <- list()
      if (!is.null(self$`ip_ranges`)) {
        IpRangesJsonGet200ResponseValueObject[["ip_ranges"]] <-
          self$`ip_ranges`
      }
      IpRangesJsonGet200ResponseValueObject
    },

    #' @description
    #' Deserialize JSON string into an instance of IpRangesJsonGet200ResponseValue
    #'
    #' @param input_json the JSON input
    #' @return the instance of IpRangesJsonGet200ResponseValue
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`ip_ranges`)) {
        self$`ip_ranges` <- ApiClient$new()$deserializeObj(this_object$`ip_ranges`, "array[character]", loadNamespace("openapi"))
      }
      self
    },

    #' @description
    #' To JSON String
    #'
    #' @return IpRangesJsonGet200ResponseValue in JSON format
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`ip_ranges`)) {
          sprintf(
          '"ip_ranges":
             [%s]
          ',
          paste(unlist(lapply(self$`ip_ranges`, function(x) paste0('"', x, '"'))), collapse = ",")
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },

    #' @description
    #' Deserialize JSON string into an instance of IpRangesJsonGet200ResponseValue
    #'
    #' @param input_json the JSON input
    #' @return the instance of IpRangesJsonGet200ResponseValue
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`ip_ranges` <- ApiClient$new()$deserializeObj(this_object$`ip_ranges`, "array[character]", loadNamespace("openapi"))
      self
    },

    #' @description
    #' Validate JSON input with respect to IpRangesJsonGet200ResponseValue and throw an exception if invalid
    #'
    #' @param input the JSON input
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },

    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of IpRangesJsonGet200ResponseValue
    toString = function() {
      self$toJSONString()
    },

    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    isValid = function() {
      TRUE
    },

    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },

    #' @description
    #' Print the object
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# IpRangesJsonGet200ResponseValue$unlock()
#
## Below is an example to define the print function
# IpRangesJsonGet200ResponseValue$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# IpRangesJsonGet200ResponseValue$lock()

