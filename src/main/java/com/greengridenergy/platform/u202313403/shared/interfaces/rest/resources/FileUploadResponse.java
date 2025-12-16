package com.greengridenergy.platform.u202313403.shared.interfaces.rest.resources;

/**
 * Response resource for file upload operations.
 * Contains the public URL of the uploaded file.
 *
 * @param fileUrl The public URL where the uploaded file can be accessed
 */
public record FileUploadResponse(String fileUrl) {
}

